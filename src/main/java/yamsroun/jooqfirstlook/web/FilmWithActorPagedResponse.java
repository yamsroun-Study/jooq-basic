package yamsroun.jooqfirstlook.web;

import lombok.Getter;
import yamsroun.jooqfirstlook.film.FilmWithActor;

import java.util.List;

@Getter
public class FilmWithActorPagedResponse {

    private List<FilmActorResponse> filmActors;
    private PagedResponse page;

    public FilmWithActorPagedResponse(List<FilmWithActor> filmActors, PagedResponse page) {
        this.filmActors = filmActors.stream()
            .map(FilmActorResponse::new)
            .toList();
        this.page = page;
    }

    @Getter
    public static class FilmActorResponse {

        private final String filmTitle;
        private final String actorFullName;
        private final long filmId;

        public FilmActorResponse(FilmWithActor filmWithActor) {
            this.filmTitle = filmWithActor.getFilmTitle();
            this.actorFullName = filmWithActor.getActorFullName();
            this.filmId = filmWithActor.getFilmId();
        }
    }
}
