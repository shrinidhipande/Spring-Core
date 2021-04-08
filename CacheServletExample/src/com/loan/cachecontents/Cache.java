package com.loan.cachecontents;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Cache {
	private static Cache instance = null;
	private Map<String,Object> cache = new HashMap<String,Object>();
	
	private Cache() throws IOException {
		initialize();
	};
	
	public static Cache getInstance() throws IOException {
		if(instance == null)
			instance = new Cache();
		
		return instance;
	}
	
	public void put(String key,Properties props) {
		cache.put(key, props);
	}
	
	public Properties get(String key) {
		return (Properties)cache.get(key);
	}
	
	private void initialize() throws IOException {
		Properties props = new Properties();
		props.load(this.getClass().getClassLoader().getResourceAsStream("cities.properties"));
		put("cities",props);
	}

}
