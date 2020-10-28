package com.cyapp;

import com.cyapp.interfaces.Course;
import com.cyapp.services.OfficeHours;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CyappApplication {

	public static void main(String[] args) {

		ApplicationContext container = SpringApplication.run(CyappApplication.class, args);
		Course course = container.getBean("java", Course.class);


		System.out.println(course.getTeachingHours());
	}

}
