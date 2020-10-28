package com.cyapp.services;

import com.cyapp.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {
    @Override
    public int getHours() {
        return 50;
    }
}
