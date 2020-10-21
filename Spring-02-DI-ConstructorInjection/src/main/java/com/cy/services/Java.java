package com.cy.services;

import com.cy.interfaces.Course;
import com.cy.interfaces.ExtraSessions;

public class Java implements Course {

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours: " + (20 + extraSessions.getHours()));

    }
}
