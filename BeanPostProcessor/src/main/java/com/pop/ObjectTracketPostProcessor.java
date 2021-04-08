package com.pop;

import org.springframework.beans.factory.config.BeanPostProcessor;

import com.postprocessor.helper.BeanCounter;

public class ObjectTracketPostProcessor implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object obj,String beanId) {
		return obj;
	}

	
	@Override
	public Object postProcessAfterInitialization(Object obj,String beanId) {
		BeanCounter.increment();
		return obj;
	}
	
	
}
