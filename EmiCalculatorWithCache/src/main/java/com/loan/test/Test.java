package com.loan.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.loan.beans.EmiCalculator;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		
		EmiCalculator calc = beanFactory.getBean("emiCalculator",EmiCalculator.class);
		
		System.out.println(calc.calculate());
	}

}
