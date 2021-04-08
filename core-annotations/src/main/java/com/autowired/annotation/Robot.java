package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {
	/*@Autowired*/
	private Sensor sensor;

	/*
	 * @Autowired public void initMethod(Sensor sensor) { this.sensor = sensor; }
	 */
	
	/*
	 * @Autowired public Robot(Sensor mySensor) { this.sensor = mySensor; }
	 */
	
	
	 @Autowired(required=false)
	 public void setSensor(Sensor sensor) { this.sensor = sensor; }
	 
	
	public void boot() {
		System.out.println("Robot booted with sensor");
	}
	
}
