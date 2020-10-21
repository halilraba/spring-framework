package com.cy;

import com.cy.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = (Course) container.getBean("java");
        Course course2 = (Course) container.getBean("java");

        System.out.println("Pointing to the same object:" + (course1 == course2));

        System.out.println("Memory Location for the course1:" + course1);

        System.out.println("Memory Location for the course1:" + course2);


    }
}
