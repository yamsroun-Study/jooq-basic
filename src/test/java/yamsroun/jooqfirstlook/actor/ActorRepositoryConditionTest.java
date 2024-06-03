package yamsroun.jooqfirstlook.actor;

import org.jooq.generated.tables.pojos.Actor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ActorRepositoryConditionTest {

    @Autowired ActorRepository repository;

    @Test
    @DisplayName("and 조건 검색 - firstName과 lastName이 일치하는 배우 조회")
    void and_1() {
        //given
        String firstName = "ED";
        String lastName = "CHASE";

        //when
        List<Actor> result = repository.findByFirstNameAndLastName(firstName, lastName);

        //then
        assertThat(result).hasSize(1);
    }

    @Test
    @DisplayName("or 조건 검색 - firstName 또는 lastName이 일치하는 배우 조회")
    void or_1() {
        //given
        String firstName = "ED";
        String lastName = "CHASE";

        //when
        List<Actor> result = repository.findByFirstNameOrLastName(firstName, lastName);

        //then
        assertThat(result).hasSizeGreaterThanOrEqualTo(1);
    }

    @Test
    @DisplayName("in 조건 검색 - 동적 조건")
    void in_dynamic_condition_1() {
        //given
        List<Long> ids = List.of(1L, 10L);

        //when
        List<Actor> result = repository.findByActorIdIn(ids);

        //then
        assertThat(result).hasSize(ids.size());
    }

    @Test
    @DisplayName("in 조건 검색 - 빈 리스트 시 제외")
    void in_dynamic_condition_2() {
        //given
        List<Long> ids = List.of();

        //when
        List<Actor> result = repository.findByActorIdIn(ids);

        //then
        assertThat(result).isNotEmpty();
    }

    @Test
    @DisplayName("다중 조건 검색 - 배우 이름으로 조회")
    void multi_condition_1() {
        //given
        var condition = ActorFilmographyCondition.builder()
            .actorName("PENELOPE")
            .build();

        //when
        List<ActorFilmography> result = repository.findActorFilmographyBy(condition);

        //then
        assertThat(result).isNotEmpty();
    }

    @Test
    @DisplayName("다중 조건 검색 - 배우 이름과 영화 제목으로 조회")
    void multi_condition_2() {
        //given
        var condition = ActorFilmographyCondition.builder()
            .actorName("PENELOPE")
            .filmTitle("ANGELS")
            .build();

        //when
        List<ActorFilmography> result = repository.findActorFilmographyBy(condition);

        //then
        assertThat(result).isNotEmpty();
    }
}
