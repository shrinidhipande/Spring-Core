package com.sblc.beans;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int length) {
		this.length = length;
		System.out.println("Constructor called");
	}
	
	//calling setWidth is mendatory before calling area method. So set width can be considered
	//as bean lifecycle management method ot Birth lifecycle management method
	public void setWidth(int width) {
		this.width = width;
		System.out.println("setter called");
	}
	
	public void init() {
		System.out.println("init called");
	}
	
	public void destroy() {
		System.out.println("destroy called");
	}
	
	//Bean lifecycle method
	public int area() {
		return length * width;
	}
	
}
