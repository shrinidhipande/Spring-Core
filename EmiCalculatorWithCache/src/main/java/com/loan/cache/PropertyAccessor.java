package com.loan.cache;

import java.io.IOException;
import java.util.Properties;

public class PropertyAccessor implements IAccessor{

	
	
	public String getKey() {
		return "cities";
	}
	
	public Properties getData() {
		Properties props = new Properties();
		try {
			props.load(this.getClass().getClassLoader().getResourceAsStream("cities.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return props;
		
	} 
	
}
