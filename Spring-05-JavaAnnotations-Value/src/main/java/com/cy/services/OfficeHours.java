package com.cy.services;

import com.cy.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 3;
    }
}
