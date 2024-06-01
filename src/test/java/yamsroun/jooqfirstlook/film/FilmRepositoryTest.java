package yamsroun.jooqfirstlook.film;

import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yamsroun.jooqfirstlook.web.FilmWithActorPagedResponse;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FilmRepositoryTest {

    @Autowired FilmRepository repository;
    @Autowired FilmService service;

    @Test
    @DisplayName("1) 영화정보 조회")
    void findById() {
        long id = 1L;
        Film result = repository.findById(id);
        assertThat(result).isNotNull();
    }

    @Test
    @DisplayName("2) 영화정보 조회")
    void findSimpleFilmById() {
        long id = 1L;
        SimpleFilmInfo result = repository.findSimpleFilmById(id);
        assertThat(result).hasNoNullFieldsOrProperties();
    }

    @Test
    @DisplayName("3) 영화와 출연한 배우 정보를 페이징하여 조회")
    void getFilmActorPageResponse() {
        int page = 1;
        int pageSize = 20;
        FilmWithActorPagedResponse result = service.getFilmActorPageResponse(page, pageSize);
        assertThat(result.getFilmActors()).hasSize(pageSize);
    }

}
