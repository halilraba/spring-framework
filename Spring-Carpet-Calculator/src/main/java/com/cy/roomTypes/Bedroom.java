package com.cy.roomTypes;

import com.cy.interfaces.floorTypes.Rooms;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom implements Rooms {

    @Value("${width}")
    private int width;

    @Override
    public int getArea() {
        return width*width;
    }
}
