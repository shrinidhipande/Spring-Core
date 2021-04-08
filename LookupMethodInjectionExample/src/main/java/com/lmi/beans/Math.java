package com.lmi.beans;

//In sbcf scope of Math is prototype means this is non singleton class
public class Math {

	//Non sharable states (Non singleton class)
	private int i;
	private int j;
	
	public void setI(int i) {
		this.i = i;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public void add() {
		int sum = i + j;
		System.out.println(sum);
	}
	
	public void subtract() {
		int sub = i - j;
		System.out.println(sub);
	}
	
}
