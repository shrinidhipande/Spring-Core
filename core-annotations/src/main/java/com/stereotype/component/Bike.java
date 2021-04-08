package com.stereotype.component;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Lazy
public class Bike {
	
	public Bike() {
		System.out.println("Bike Constructore called");
	}
	
}
