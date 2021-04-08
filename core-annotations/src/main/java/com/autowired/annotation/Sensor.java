package com.autowired.annotation;

public class Sensor {
	private String sensorType;

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
		System.out.println("Sensor Setter called");
	}
	
	public String toString() {
		return sensorType;
	}
	
}
