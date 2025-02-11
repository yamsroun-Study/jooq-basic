package yamsroun.jooqfirstlook.film;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.generated.tables.*;
import org.jooq.generated.tables.pojos.Film;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class FilmRepository {

    private static final JFilm FILM = JFilm.FILM;

    private final DSLContext dsl;

    public Film findById(long id) {
        return dsl.select(FILM.fields())
            .from(FILM)
            .where(FILM.FILM_ID.eq(id))
            .fetchOneInto(Film.class);
    }

    public SimpleFilmInfo findSimpleFilmById(long id) {
        return dsl.select(FILM.FILM_ID, FILM.TITLE, FILM.DESCRIPTION)
            .from(FILM)
            .where(FILM.FILM_ID.eq(id))
            .fetchOneInto(SimpleFilmInfo.class);
    }

    public List<FilmWithActor> findFilmWithActorList(int page, int pageSize) {
        JFilmActor FILM_ACTOR = JFilmActor.FILM_ACTOR;
        JActor ACTOR = JActor.ACTOR;

        return dsl.select(
                DSL.row(FILM.fields()),
                DSL.row(FILM_ACTOR.fields()),
                DSL.row(ACTOR.fields()))
            .from(FILM)
            .join(FILM_ACTOR).on(FILM_ACTOR.FILM_ID.eq(FILM.FILM_ID))
            .join(ACTOR).on(ACTOR.ACTOR_ID.eq(FILM_ACTOR.ACTOR_ID))
            .offset((page - 1) * pageSize)
            .limit(pageSize)
            .fetchInto(FilmWithActor.class);
    }

    public List<FilmWithActor> findFilmWithActorListImplicitPathJoin(int page, int pageSize) {
        JFilmActor FILM_ACTOR = JFilmActor.FILM_ACTOR;
        JActor ACTOR = JActor.ACTOR;

        return dsl.select(
                DSL.row(FILM.fields()),
                DSL.row(FILM.filmActor().fields()),
                DSL.row(FILM.filmActor().actor().fields()))
            .from(FILM)
            //.join(FILM_ACTOR).on(FILM_ACTOR.FILM_ID.eq(FILM.FILM_ID))
            //.join(ACTOR).on(ACTOR.ACTOR_ID.eq(FILM_ACTOR.ACTOR_ID))
            .offset((page - 1) * pageSize)
            .limit(pageSize)
            .fetchInto(FilmWithActor.class);
    }

    public List<FilmWithActor> findFilmWithActorListExplicitPathJoin(int page, int pageSize) {
        JFilmActor FILM_ACTOR = JFilmActor.FILM_ACTOR;
        JActor ACTOR = JActor.ACTOR;

        return dsl.select(
                DSL.row(FILM.fields()),
                DSL.row(FILM.filmActor().fields()),
                DSL.row(FILM.filmActor().actor().fields()))
            .from(FILM)
            .join(FILM.filmActor())
            .join(FILM.filmActor().actor())
            .offset((page - 1) * pageSize)
            .limit(pageSize)
            .fetchInto(FilmWithActor.class);
    }
}
