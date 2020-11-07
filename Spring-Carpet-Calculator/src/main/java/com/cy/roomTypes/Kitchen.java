package com.cy.roomTypes;

import com.cy.interfaces.floorTypes.Rooms;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Rooms {

    @Value("${radius}")
    private int radius;

    @Override
    public int getArea() {
        return (int) Math.PI*radius*radius;
    }
}
