package main.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"main.java"})
public class StudentAppConfig {

    @Bean
    public InternalResourceViewResolver viewResolver( ) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
            viewResolver.setPrefix("WEB-INF/v159iew/");
            viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
