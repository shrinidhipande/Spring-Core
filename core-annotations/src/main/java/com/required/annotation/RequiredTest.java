package com.required.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredTest {

	public static void main(String[] args) {

		/*
		 * DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		 * BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		 * reader.loadBeanDefinitions(new
		 * ClassPathResource("com/required/annotation/required-context.xml"));
		 * 
		 * 
		 * //If we are creating IOC container with BeanFactory then we need to register
		 * BeanPostProcessorfor @Required annotation Manually. // If not
		 * registered, @Required annotation will not work and create Motor object
		 * without setter injection also. RequiredAnnotationBeanPostProcessor bpp = new
		 * RequiredAnnotationBeanPostProcessor(); beanFactory.addBeanPostProcessor(bpp);
		 * 
		 * Motor motor = beanFactory.getBean("motor",Motor.class);
		 * System.out.println(motor);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("com/required/annotation/required-context.xml");
		Motor motor = context.getBean("motor", Motor.class);
		System.out.println(motor);

	}

	
	
}
