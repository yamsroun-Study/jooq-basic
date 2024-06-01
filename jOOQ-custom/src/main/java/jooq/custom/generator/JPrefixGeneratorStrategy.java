package jooq.custom.generator;

import org.jooq.codegen.DefaultGeneratorStrategy;
import org.jooq.meta.Definition;

public class JPrefixGeneratorStrategy extends DefaultGeneratorStrategy {

    private static final String PREFIX = "J";

    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        if (mode == Mode.DEFAULT) {
            return PREFIX + super.getJavaClassName(definition, mode);
        }
        return super.getJavaClassName(definition, mode);
    }
}
