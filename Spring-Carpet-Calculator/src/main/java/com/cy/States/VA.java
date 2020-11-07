package com.cy.States;

import com.cy.enums.Cities;
import com.cy.interfaces.carpetPrices.Carpet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class VA implements Carpet {

    Map vaPrices = new HashMap();


    public VA() {
        vaPrices.put(Cities.ARLINGTON,1);
        vaPrices.put(Cities.FAIRFAX,2);
        vaPrices.put(Cities.MCLEAN,3);
    }

    @Override
    public int getUnitPrice(Cities city) {
        return (int) vaPrices.get(city);
    }
}
