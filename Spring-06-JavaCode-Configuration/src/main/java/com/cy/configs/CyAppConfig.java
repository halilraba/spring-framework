package com.cy.configs;

import com.cy.interfaces.ExtraSession;
import com.cy.services.Java;
import com.cy.services.OfficeHours;
import com.cy.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.cy")
@PropertySource("classpath:application.properties")
public class CyAppConfig {

    // @Bean is a method level annotation that creates bean from a class. We can use it instead of @Component annotation on class level. For ex. if we are using 3rd party classes(if we cannot reach them) @Bean is the best way to create bean
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

//    @Bean
//    public ExtraSession extraSession(){
//        return new OfficeHours();
//    }

}
