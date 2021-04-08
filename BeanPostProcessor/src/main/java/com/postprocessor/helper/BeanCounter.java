package com.postprocessor.helper;

import java.util.concurrent.atomic.AtomicInteger;

public class BeanCounter {
	public static AtomicInteger counter = new AtomicInteger(0);
	
	public static void increment() {
		counter.incrementAndGet();
	}
	
	public static AtomicInteger getCount() {
		return counter;
	}
}
