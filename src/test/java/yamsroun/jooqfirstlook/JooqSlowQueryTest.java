package yamsroun.jooqfirstlook;

import org.jooq.DSLContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.jooq.impl.DSL.dual;
import static org.jooq.impl.DSL.field;

@SpringBootTest
public class JooqSlowQueryTest {

    @Autowired
    DSLContext dslContext;

    @Test
    @DisplayName("Slow Query 탐지")
    void detectSlowQuery() {
        dslContext.select(field("SLEEP(4)"))
                .from(dual())
                .execute();
    }
}
