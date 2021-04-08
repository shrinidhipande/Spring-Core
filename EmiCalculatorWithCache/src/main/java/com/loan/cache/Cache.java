package com.loan.cache;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Cache {
	private static Cache instance = null;
	private Map<String,Object> cache = new HashMap<String,Object>();
	
	private Cache() {
	}
	
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
	

}
