package com.cy;

import com.cy.configs.CyAppConfig;
import com.cy.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CyAppConfig.class);

        Course course = (Course) container.getBean("java");

        course.getTeachingHours();

    }
}
