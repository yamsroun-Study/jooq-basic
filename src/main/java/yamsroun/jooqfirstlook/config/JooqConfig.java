package yamsroun.jooqfirstlook.config;

import org.springframework.boot.autoconfigure.jooq.DefaultConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class JooqConfig {

    @Bean
    public DefaultConfigurationCustomizer jooqDefaultConfigurationCustomizer() {
        return customizer -> customizer.settings()
            .withRenderSchema(false);
    }
}
