package com.programaticapproach.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle implements InitializingBean,DisposableBean{

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int area() {
		return radius*radius;
	}
	
	//Just to check which approach of 
	//Bean Lifecycle management gets priority
	public void init() {
		System.out.println("init method called");
	}
	
	//Just to check which approach of 
	//Bean Lifecycle management gets priority
	public void delete() {
		System.out.println("delete method called");
	}
	
	//InitializingBean Method
	@Override
	public void afterPropertiesSet() {
		System.err.println("after properties set called");
	}
	
	//DisposableBean Method
	@Override
	public void destroy() {
		System.out.println("destroy called");
	}
}
