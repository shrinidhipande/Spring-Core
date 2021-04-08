package com.sblc.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.programaticapproach.beans.Circle;
import com.sblc.beans.Rectangle;

public class AppTest {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory beanFactory= new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com\\sblc\\sbcf\\application-context.xml"));
		
		//Rectangle rect = beanFactory.getBean("rectangle",Rectangle.class);
		//System.out.println(rect.area());
		
		Circle circle = beanFactory.getBean("circle",Circle.class);
		System.out.println(circle.area());
		
	}

}
