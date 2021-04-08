package com.stereotype.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/component/component-context.xml");
		Bike b1 = context.getBean("bike",Bike.class);
		//Bike b2 = context.getBean("bike",Bike.class);
		
		//System.out.println(b1 == b2);
	}

}
