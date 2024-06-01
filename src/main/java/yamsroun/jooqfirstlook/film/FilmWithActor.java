package yamsroun.jooqfirstlook.film;

import org.jooq.generated.tables.pojos.*;

public record FilmWithActor(
    Film film,
    FilmActor filmActor,
    Actor actor
) {

    public String getFilmTitle() {
        return film.getTitle();
    }

    public String getActorFullName() {
        return actor.getFirstName() + " " + actor.getLastName();
    }

    public long getFilmId() {
        return film.getFilmId();
    }
}
