package yamsroun.jooqfirstlook.film;

import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FilmRepositoryTest {

    @Autowired FilmRepository repository;

    @Test
    @DisplayName("1) 영화정보 조회")
    void findById() {
        Film film = repository.findById(1L);
        assertThat(film).isNotNull();
    }

}
