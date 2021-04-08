package com.only.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Radio radio = context.getBean("radio",Radio.class);
		System.out.println(radio);
		
		Radio radio1 = context.getBean("radio_1",Radio.class);
		System.out.println(radio1);
	}

}
 