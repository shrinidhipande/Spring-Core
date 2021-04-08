package com.bfpp.beans;

public class Contact {

	private int id;
	private String name;
	private int accNo;
	
	public Contact(int id, String name,int accNo) {
		super();
		this.id = id;
		this.name = name;
		this.accNo = accNo;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	
}
