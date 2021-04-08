package com.only.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mybike")
public class Bike {
	
	public Bike() {
		System.out.println("Bike constructor called");
	}
	
	public void start() {
		System.out.println("Bike started");
	}
}
