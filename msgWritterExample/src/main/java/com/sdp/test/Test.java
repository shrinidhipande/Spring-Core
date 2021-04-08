package com.sdp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sdp.beans.MessageWritter;

public class Test {

	public static void main(String[] args) {
		
		ClassPathResource resource = new ClassPathResource("com/sdp/sbcf/application-context.xml");
		
		System.out.println(resource.getClassLoader());
		
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		MessageWritter writter = beanFactory.getBean("msgWritter",MessageWritter.class);
		
		writter.writeMessage("Hello");

	}

}
