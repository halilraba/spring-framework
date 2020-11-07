package com.cy;

import com.cy.States.VA;
import com.cy.enums.Cities;
import com.cy.interfaces.carpetPrices.Carpet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCarpetCalculatorApplication {

	public static void main(String[] args) {

		ApplicationContext container = SpringApplication.run(SpringCarpetCalculatorApplication.class, args);
		Carpet carpet = (Carpet) container.getBean("VA");
		System.out.println(carpet.getUnitPrice(Cities.ARLINGTON));
	}

}
