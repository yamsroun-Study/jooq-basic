package yamsroun.jooqfirstlook.film;

import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FilmDaoWrapperTest {

    @Autowired FilmRepositoryIsA repositoryIsA;
    @Autowired FilmRepositoryHasA repositoryHasA;

    @Test
    @DisplayName("1) 영화정보 조회 (상속)")
    void findById1() {
        long id = 1L;
        Film result = repositoryIsA.findById(id);
        assertThat(result).isNotNull();
    }

    @Test
    @DisplayName("2) 영화정보 조회 (구성)")
    void findById2() {
        long id = 1L;
        Film result = repositoryHasA.findById(id);
        assertThat(result).isNotNull();
    }

    @Test
    @DisplayName("3) 영화 상영시간 범위 조회 (상속)")
    void findByRangeBetween1() {
        int from = 100;
        int to = 100;
        List<Film> result = repositoryIsA.fetchRangeOfJLength(from, to);
        assertThat(result).allSatisfy(film ->
            assertThat(film.getLength()).isBetween(from, to));
    }

    @Test
    @DisplayName("4) 영화 상영시간 범위 조회 (구성)")
    void findByRangeBetween2() {
        int from = 100;
        int to = 100;
        List<Film> result = repositoryHasA.findByRangeBetween(from, to);
        assertThat(result).allSatisfy(film ->
            assertThat(film.getLength()).isBetween(from, to));
    }

}
