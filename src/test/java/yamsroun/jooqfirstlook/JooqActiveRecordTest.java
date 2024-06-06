package yamsroun.jooqfirstlook;

import org.jooq.DSLContext;
import org.jooq.generated.tables.JActor;
import org.jooq.generated.tables.records.ActorRecord;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import yamsroun.jooqfirstlook.actor.ActorRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JooqActiveRecordTest {

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    DSLContext dslContext;

    @Test
    @DisplayName("SELECT 절 예제")
    void activeRecord_조회_예제() {
        // given
        Long actorId = 1L;

        // when
        ActorRecord actorRecord = actorRepository.findRecordByActorId(actorId);

        // then
        assertThat(actorRecord).hasNoNullFieldsOrProperties();
    }

    @Test
    @DisplayName("activeRecord refresh 예제")
    void activeRecord_refresh_예제() {
        // given
        Long actorId = 1L;
        ActorRecord actor = actorRepository.findRecordByActorId(actorId);
        actor.setFirstName(null);

        // when
        actor.refresh();
        //actor.refresh(JActor.ACTOR.FIRST_NAME);

        // then
        assertThat(actor.getFirstName()).isNotBlank();
    }

    @Test
    @DisplayName("activeRecord store 예제 - insert")
    @Transactional
    void activeRecord_insert_예제() {
        // given
        ActorRecord actorRecord = dslContext.newRecord(JActor.ACTOR);

        // when
        actorRecord.setFirstName("john");
        actorRecord.setLastName("doe");
        actorRecord.store(); //Insert, Update 문
        //actorRecord.insert(); //Insert 문

        //actorRecord.refresh(); //D B데이터 불러오기

        // then
        assertThat(actorRecord.getLastUpdate()).isNull();
        //Assertions.assertThat(actorRecord.getLastUpdate()).isNotNull();
    }

    @Test
    @DisplayName("activeRecord store 예제 - update")
    @Transactional
    void activeRecord_update_예제() {
        // given
        Long actorId = 1L;
        String newName = "test";
        ActorRecord actor = actorRepository.findRecordByActorId(actorId);

        // when
        actor.setFirstName(newName);
        actor.store();
        //actor.update();

        // then
        assertThat(actor.getFirstName()).isEqualTo(newName);
    }

    @Test
    @DisplayName("activeRecord delete 예제")
    @Transactional
    void activeRecord_delete_예제() {
        // given
        ActorRecord actorRecord = dslContext.newRecord(JActor.ACTOR);

        // when
        actorRecord.setFirstName("john");
        actorRecord.setLastName("doe");
        actorRecord.store();

        // when
        int affectedRows = actorRecord.delete();

        // then
        assertThat(affectedRows).isEqualTo(1);
        assertThat(actorRecord).hasNoNullFieldsOrProperties();
    }
}
