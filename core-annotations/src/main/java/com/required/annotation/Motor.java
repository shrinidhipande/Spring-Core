package com.required.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Motor {

	private Tank tank;
	
	@Required
	public void setTank(Tank tank) {
		this.tank  = tank;
	}

	@Override
	public String toString() {
		return "Motor [tank=" + tank + "]";
	}
		
}
