package yamsroun.jooqfirstlook.film;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.generated.tables.JFilm;
import org.jooq.generated.tables.pojos.Film;
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
}
