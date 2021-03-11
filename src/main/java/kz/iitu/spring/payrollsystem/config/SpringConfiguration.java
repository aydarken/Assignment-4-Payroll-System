package kz.iitu.spring.payrollsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "kz.iitu.spring.payrollsystem")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "kz.iitu.spring.payrollsystem.repository")
public class SpringConfiguration {
}
