package com.collection.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.collection.di.entity.Library;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/di/common/application-context.xml"));
		
		Library l1= beanFactory.getBean("lib",Library.class);
		
		System.out.println(l1);
		
	}

}
