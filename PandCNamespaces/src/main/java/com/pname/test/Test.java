package com.pname.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pname.beans.Employee;

public class Test {

	public static void main(String[] args) {
		
	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("com/sbcf/common/application-context.xml"));		
		Employee emp = beanFactory.getBean("emp",Employee.class);
		System.out.println(emp);
		
	}

}
