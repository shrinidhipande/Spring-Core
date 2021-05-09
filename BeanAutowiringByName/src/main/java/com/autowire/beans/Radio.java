package com.autowire.beans;

import lombok.Data;

@Data
public class Radio {
	
	private Receiver receiver;
	private String company;
	
	public String toString() {
		return "Radio "+company+" Started with receiver "+receiver;
	}
	
}
