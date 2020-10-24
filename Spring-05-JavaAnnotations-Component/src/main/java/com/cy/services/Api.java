package com.cy.services;

import com.cy.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Api implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Hours: 11");
    }
}
