package yamsroun.jooqfirstlook.film;

import org.jooq.generated.tables.pojos.Film;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JooqSubqueryTest {

    @Autowired
    private FilmRepositoryHasA repository;

    @Test
    void subquery_scala() {
        //given
        String filmTitle = "EGG";
        //when
        List<FilmPriceSummary> result = repository.findFilmPriceSummaryByFilmTitle(filmTitle);
        //then
        assertThat(result).isNotEmpty();
    }

    @Test
    void subquery_inline_view() {
        //given
        String filmTitle = "EGG";
        //when
        List<FilmRentalSummary> result = repository.findFilmRentalSummaryByFilmTitleLike(filmTitle);
        //then
        assertThat(result).isNotEmpty();
    }

    @Test
    void subquery_condition() {
        //given
        String filmTitle = "EGG";
        //when
        List<Film> result = repository.findRentedFilmByTitle(filmTitle);
        //then
        assertThat(result).isNotEmpty();
    }
}
