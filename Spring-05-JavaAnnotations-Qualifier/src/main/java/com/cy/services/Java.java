package com.cy.services;

import com.cy.interfaces.Course;
import com.cy.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //Field Injection
    //@Autowired
    //@Qualifier("officeHours")
    private ExtraSessions extraSessions;

    //Constructor Injection
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly teaching hours: " + (20 + extraSessions.getHours()));
    }

}
