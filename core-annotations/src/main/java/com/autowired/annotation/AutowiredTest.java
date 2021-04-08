package com.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowired/annotation/autowired-context.xml");
	
		Robot robot = context.getBean(Robot.class);
		
		robot.boot();
		
	}

}
