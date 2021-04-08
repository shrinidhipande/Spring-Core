package com.required.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Tank {
	private int capacity;
	private String fuelType;
	

	@Required
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Tank [capacity=" + capacity + ", fuelType=" + fuelType + "]";
	}
	
	
}
