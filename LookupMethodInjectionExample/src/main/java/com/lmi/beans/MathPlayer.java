package com.lmi.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

//If we see into sbcf , we  scope of MathPlayer is singleton
public class MathPlayer implements BeanFactoryAware{
	BeanFactory beanFactory = null;
	
	public void add(int i,int j) {
		Math math = null;
		math = getMath();
		math.setI(i);
		math.setJ(j);
		
		math.add();
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = 	beanFactory;
	}
	
	public Math getMath() {
		//Here I am tightly coupled with Spring framework.
		// To avoid it we can go for lookupMethod injection in spring
		//Math math = beanFactory.getBean("math",Math.class);
		//return math;
		return null;
	}

}
