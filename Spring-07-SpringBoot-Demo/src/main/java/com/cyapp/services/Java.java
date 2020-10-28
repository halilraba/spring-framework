package com.cyapp.services;

import com.cyapp.interfaces.Course;
import com.cyapp.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSession extraSession;

    @Value("${instructor}")
    private String instractorName;

    @Autowired
    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public int getTeachingHours() {
        return 5 + extraSession.getHours();
    }
}
