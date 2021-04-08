package com.loan.beans;

public class LoanEstimate {

	String firstName;
	String lastName;
	String email;
	int age;
	String city;
	long amount;
	int tenureInMonth;
	double interest;
	
	
	public int getTenureInMonth() {
		return tenureInMonth;
	}
	public void setTenureInMonth(int tenureInMonth) {
		this.tenureInMonth = tenureInMonth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	
	
}
