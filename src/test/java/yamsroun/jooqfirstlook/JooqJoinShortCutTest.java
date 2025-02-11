package yamsroun.jooqfirstlook;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yamsroun.jooqfirstlook.film.FilmRepository;
import yamsroun.jooqfirstlook.film.FilmWithActor;

@SpringBootTest
public class JooqJoinShortCutTest {

    @Autowired
    FilmRepository filmRepository;

    @Test
    @DisplayName("implicitPathJoin_테스트")
    void implicitPathJoin_테스트() {

        List<FilmWithActor> original = filmRepository.findFilmWithActorList(1, 10);
        List<FilmWithActor> implicit = filmRepository.findFilmWithActorListImplicitPathJoin(1, 10);

        Assertions.assertThat(original)
            .usingRecursiveFieldByFieldElementComparator()
            .isEqualTo(implicit);
    }

    @Test
    @DisplayName("explicitPathJoin_테스트")
    void explicitPathJoin_테스트() {

        List<FilmWithActor> original = filmRepository.findFilmWithActorList(1, 10);
        List<FilmWithActor> implicit = filmRepository.findFilmWithActorListExplicitPathJoin(1, 10);

        Assertions.assertThat(original)
            .usingRecursiveFieldByFieldElementComparator()
            .isEqualTo(implicit);
    }
}
