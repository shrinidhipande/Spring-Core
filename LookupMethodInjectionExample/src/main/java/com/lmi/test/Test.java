package com.lmi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.lmi.beans.MathPlayer;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		
		MathPlayer player = beanFactory.getBean("mathPlayer",MathPlayer.class);
		
		player.add(10,2);
				

	}

}
