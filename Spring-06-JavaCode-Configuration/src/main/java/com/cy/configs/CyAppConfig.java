package com.cy.configs;

import com.cy.services.Java;
import com.cy.services.OfficeHours;
import com.cy.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cy")
public class CyAppConfig {

    // @Bean is a method level annotation that creates bean from a class. We can use it instead of @Component annotation on class level
    @Bean
    public Java java(){
        return new Java(officeHours());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }
}
