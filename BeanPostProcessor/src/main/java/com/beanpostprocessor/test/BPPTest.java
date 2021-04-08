package com.beanpostprocessor.test;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.pop.ObjectTracketPostProcessor;
import com.postprocessor.helper.BeanCounter;
import com.postprocessors.bean.Pilot;
import com.postprocessors.bean.Plane;
import com.postprocessors.bean.Robot;

public class BPPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
		BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("com/sbcf/application-context.xml"));
		
		BeanPostProcessor pp = new ObjectTracketPostProcessor();
		beanFactory.addBeanPostProcessor(pp);
		
		Robot r = beanFactory.getBean("robot",Robot.class);
		Pilot pi = beanFactory.getBean("pilot",Pilot.class);
		Plane pl = beanFactory.getBean("plane", Plane.class);
		
		System.out.println(BeanCounter.getCount());
		
		Robot r1 = beanFactory.getBean("robot",Robot.class);
		Pilot pi1 = beanFactory.getBean("pilot",Pilot.class);
		Plane pl1 = beanFactory.getBean("plane", Plane.class);
		
		System.out.println(BeanCounter.getCount());
	}

}
