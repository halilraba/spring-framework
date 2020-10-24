package com.cy.services;

import com.cy.interfaces.ExtraSession;
import org.springframework.stereotype.Component;


public class OfficeHours implements ExtraSession {
    @Override
    public int getHours() {
        return 5;
    }
}
