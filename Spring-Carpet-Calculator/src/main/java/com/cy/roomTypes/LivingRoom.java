package com.cy.roomTypes;

import com.cy.interfaces.floorTypes.Rooms;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LivingRoom implements Rooms {

    @Value("${rectangleWidth}")
    private int rectangleWidth;

    @Value("${rectangleLength}")
    private int rectangleLength;

    @Override
    public int getArea() {
        return rectangleLength*rectangleWidth;
    }
}
