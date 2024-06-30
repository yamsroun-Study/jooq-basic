package yamsroun.jooqfirstlook.config;

import org.jooq.conf.ExecuteWithoutWhere;
import org.springframework.boot.autoconfigure.jooq.DefaultConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class JooqConfig {

    @Bean
    public DefaultConfigurationCustomizer jooqDefaultConfigurationCustomizer() {
        return customizer -> {
            customizer.set(PerformanceListener::new);
            customizer.settings()
                .withRenderSchema(false)
                .withExecuteUpdateWithoutWhere(ExecuteWithoutWhere.THROW)
                .withExecuteDeleteWithoutWhere(ExecuteWithoutWhere.THROW);
        };
    }
}
