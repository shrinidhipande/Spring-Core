package com.aware.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Car implements BeanFactoryAware {

	BeanFactory beanFactory;
	String beanName;
	
	public void drive() {
		
		IEngine engine = beanFactory.getBean(beanName,IEngine.class);
		
		engine.start();
		
		System.out.println("car started running");
		
	}
	
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory=beanFactory;
	}
	
}
