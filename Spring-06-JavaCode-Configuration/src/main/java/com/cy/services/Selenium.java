package com.cy.services;

import com.cy.interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Selenium weekly hours: 10");
    }
}
