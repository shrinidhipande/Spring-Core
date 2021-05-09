package com.autowire.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.autowire.beans.Radio;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/autowire/common/application-context.xml"));
		
		Radio radio = beanFactory.getBean("radio",Radio.class);
		
		System.out.println(radio);
	}

}
