package yamsroun.jooqfirstlook.actor;

import org.jooq.*;
import org.jooq.generated.tables.*;
import org.jooq.generated.tables.daos.ActorDao;
import org.jooq.generated.tables.pojos.Actor;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.generated.tables.records.ActorRecord;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

import static yamsroun.jooqfirstlook.utils.JooqConditionUtils.inIfNotEmpty;

@Repository
public class ActorRepository {

    private static final JActor ACTOR = JActor.ACTOR;

    private final ActorDao actorDao;
    private final DSLContext dslContext;

    public ActorRepository(Configuration configuration, DSLContext dslContext) {
        this.actorDao = new ActorDao(configuration);
        this.dslContext = dslContext;
    }

    public List<Actor> findByFirstNameAndLastName(String firstName, String lastName) {
        return dslContext.selectFrom(ACTOR)
            //.where(ACTOR.FIRST_NAME.eq(firstName)
            //    .and(ACTOR.LAST_NAME.eq(lastName)))
            .where(ACTOR.FIRST_NAME.eq(firstName),
                ACTOR.LAST_NAME.eq(lastName))
            .fetchInto(Actor.class);

    }

    public List<Actor> findByFirstNameOrLastName(String firstName, String lastName) {
        return dslContext.selectFrom(ACTOR)
            .where(ACTOR.FIRST_NAME.eq(firstName)
                .or(ACTOR.LAST_NAME.eq(lastName)))
            .fetchInto(Actor.class);
    }

    public List<Actor> findByActorIdIn(List<Long> ids) {
        return dslContext.selectFrom(ACTOR)
            .where(inIfNotEmpty(ACTOR.ACTOR_ID, ids))
            .fetchInto(Actor.class);
    }

    public List<ActorFilmography> findActorFilmographyBy(ActorFilmographyCondition condition) {
        JFilmActor FILM_ACTOR = JFilmActor.FILM_ACTOR;
        JFilm FILM = JFilm.FILM;

        return dslContext.select(
                DSL.row(ACTOR.fields()).as("actor"),
                DSL.row(FILM.fields()).as("film"))
            .from(ACTOR)
            .join(FILM_ACTOR).on(ACTOR.ACTOR_ID.eq(FILM_ACTOR.ACTOR_ID))
            .join(FILM).on(FILM.FILM_ID.eq(FILM_ACTOR.FILM_ID))
            .where(
                containsIfNotBlank(ACTOR.FIRST_NAME.concat(" ").concat(ACTOR.LAST_NAME), condition.getActorName()),
                containsIfNotBlank(FILM.TITLE, condition.getFilmTitle())
            )
            .fetchGroups(
                record -> record.get("actor", Actor.class),
                record -> record.get("film", Film.class))
            .entrySet()
            .stream()
            .map(entry -> new ActorFilmography(entry.getKey(), entry.getValue()))
            .toList();
    }

    private Condition containsIfNotBlank(Field<String> field, String value) {
        if (!StringUtils.hasText(value)) {
            return DSL.noCondition();
        }
        return field.like("%" + value + "%");
    }

    /**
     * 이 부분이 지원되기까지 굉장히 많은 논의가 있었음
     * jOOQ 3.19 부터 지원
     *
     * 참고) https://github.com/jOOQ/jOOQ/issues/2536
     * @return insert 시에 생성된 PK 값이 세팅된 pojo
     */
    public void saveByDao(Actor actor) {
        // 이때 PK (actorId)가 actor 객체에 추가됨
        actorDao.insert(actor);
    }

    public ActorRecord saveByRecord(Actor actor) {
        ActorRecord actorRecord = dslContext.newRecord(ACTOR, actor);
        actorRecord.insert();
        return actorRecord;
    }

    public Long saveWithReturningPkOnly(Actor actor) {
        return dslContext.insertInto(ACTOR,
                ACTOR.FIRST_NAME,
                ACTOR.LAST_NAME)
            .values(
                actor.getFirstName(),
                actor.getLastName())
            .returningResult(ACTOR.ACTOR_ID)
            .fetchOneInto(Long.class);
    }

    public Actor saveWithReturning(Actor actor) {
        return dslContext.insertInto(ACTOR,
                ACTOR.FIRST_NAME,
                ACTOR.LAST_NAME)
            .values(
                actor.getFirstName(),
                actor.getLastName())
            .returningResult(ACTOR.fields())
            .fetchOneInto(Actor.class);
    }

    public int bulkInsertWithRows(List<Actor> actors) {
        var rows = actors.stream()
            .map(actor -> DSL.row(
                actor.getFirstName(),
                actor.getLastName()))
            .toList();
        return dslContext.insertInto(ACTOR,
                ACTOR.FIRST_NAME,
                ACTOR.LAST_NAME)
            .valuesOfRows(rows)
            .execute();
    }

    public void update(Actor actor) {
        actorDao.update(actor);
    }

    public Actor findByActorId(long actorId) {
        return actorDao.findById(actorId);
    }

    public int updateWithDto(long actorId, ActorUpdateRequest request) {
        var firstName = request.getFirstName() != null ? DSL.val(request.getFirstName()) : DSL.noField(ACTOR.FIRST_NAME);
        var lastName = request.getLastName() != null ? DSL.val(request.getLastName()) : DSL.noField(ACTOR.FIRST_NAME);

        return dslContext.update(ACTOR)
            .set(ACTOR.FIRST_NAME, firstName)
            .set(ACTOR.LAST_NAME, lastName)
            .where(ACTOR.ACTOR_ID.eq(actorId))
            .execute();
    }

    public int updateWithRecord(long actorId, ActorUpdateRequest request) {
        ActorRecord record = dslContext.fetchOne(ACTOR, ACTOR.ACTOR_ID.eq(actorId));
        if (record == null) {
            return 0;
        }

        if (request.getFirstName() != null) {
            record.setFirstName(request.getFirstName());
        }
        if (request.getLastName() != null) {
            record.setLastName(request.getLastName());
        }
        return dslContext.update(ACTOR)
            .set(record)
            .where(ACTOR.ACTOR_ID.eq(actorId))
            .execute();
        //또는
        //return record.update();
    }

    public int delete(long actorId) {
        //actorDao.deleteById(actorId);
        return dslContext.deleteFrom(ACTOR)
            .where(ACTOR.ACTOR_ID.eq(actorId))
            .execute();
    }

    public int deleteWithActiveRecord(long actorId) {
        ActorRecord record = dslContext.fetchOne(ACTOR, ACTOR.ACTOR_ID.eq(actorId));
        if (record == null) {
            return 0;
        }
        return record.delete();
    }
}
