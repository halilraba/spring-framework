package com.cy;

import com.cy.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = (Course) container.getBean("java");

        course.getTeachingHours();

        ((ClassPathXmlApplicationContext)container).close();

    }
}
