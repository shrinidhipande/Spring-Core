package com.only.javaconfig;



//Lets assume we dont have source code of this file with us. 
// So we can still configure this as bean definition in ioc container using Java Configuration.
//Also If I want to create multiple bean definitions of this bean then also I should go for Java configuration
public class Radio {

	private String type;
	
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Radio [type= " +type+" ]"; 
	}
	
}
