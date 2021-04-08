package com.only.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.only.annotation");
		Bike bike = context.getBean("mybike",Bike.class); //Here by default we can use "bike" as id if we have not given any id in @Component tag
		bike.start();
		
		
	}

}
