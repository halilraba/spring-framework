package com.cy.services;

import com.cy.interfaces.Course;
import com.cy.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Java implements Course {

    private ExtraSession extraSession;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly hours: " + (20+ extraSession.getHours()));
    }
}
