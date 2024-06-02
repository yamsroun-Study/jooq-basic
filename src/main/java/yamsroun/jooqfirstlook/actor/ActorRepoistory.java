package yamsroun.jooqfirstlook.actor;

import org.jooq.*;
import org.jooq.generated.tables.*;
import org.jooq.generated.tables.daos.ActorDao;
import org.jooq.generated.tables.pojos.Actor;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;

import static yamsroun.jooqfirstlook.utils.JooqConditionUtils.inIfNotEmpty;

@Repository
public class ActorRepoistory {

    private static final JActor ACTOR = JActor.ACTOR;

    private final ActorDao dao;
    private final DSLContext dsl;

    public ActorRepoistory(Configuration configuration, DSLContext dsl) {
        this.dao = new ActorDao(configuration);
        this.dsl = dsl;
    }

    public List<Actor> findByFirstNameAndLastName(String firstName, String lastName) {
        return dsl.selectFrom(ACTOR)
            //.where(ACTOR.FIRST_NAME.eq(firstName)
            //    .and(ACTOR.LAST_NAME.eq(lastName)))
            .where(ACTOR.FIRST_NAME.eq(firstName),
                ACTOR.LAST_NAME.eq(lastName))
            .fetchInto(Actor.class);

    }

    public List<Actor> findByFirstNameOrLastName(String firstName, String lastName) {
        return dsl.selectFrom(ACTOR)
            .where(ACTOR.FIRST_NAME.eq(firstName)
                .or(ACTOR.LAST_NAME.eq(lastName)))
            .fetchInto(Actor.class);
    }

public List<Actor> findByActorIdIn(List<Long> ids) {
    return dsl.selectFrom(ACTOR)
        .where(inIfNotEmpty(ACTOR.ACTOR_ID, ids))
        .fetchInto(Actor.class);
}

    public List<ActorFilmography> findActorFilmographyBy(ActorFilmographyCondition condition) {
        JFilmActor FILM_ACTOR = JFilmActor.FILM_ACTOR;
        JFilm FILM = JFilm.FILM;

        return dsl.select(
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
}
