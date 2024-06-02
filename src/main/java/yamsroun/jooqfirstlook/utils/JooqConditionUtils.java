package yamsroun.jooqfirstlook.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.impl.DSL;
import org.springframework.util.StringUtils;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JooqConditionUtils {

    public static <T> Condition eqIfNotNull(Field<T> field, T value) {
        if (value == null) {
            return DSL.noCondition();
        }
        return field.eq(value);
    }

    public static <T> Condition inIfNotEmpty(Field<T> idField, List<Long> ids) {
        if (ids.isEmpty()) {
            return DSL.noCondition();
        }
        return idField.in(ids);
    }

    public static <T> Condition containsValue(Field<T> field, String value) {
        if (!StringUtils.hasText(value)) {
            return DSL.noCondition();
        }
        return field.like("%" + value + "%");
    }
}
