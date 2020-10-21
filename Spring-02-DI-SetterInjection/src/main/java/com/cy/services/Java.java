package com.cy.services;

import com.cy.interfaces.Course;
import com.cy.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {

    private OfficeHours officeHours;

//    public OfficeHours getOfficeHours() {
//        return officeHours;
//    }
//
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours: " + (20 + officeHours.getHours()));

    }
}
