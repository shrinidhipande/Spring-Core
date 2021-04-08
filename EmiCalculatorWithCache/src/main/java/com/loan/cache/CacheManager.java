package com.loan.cache;

import java.util.Iterator;
import java.util.List;

public class CacheManager {

	Cache cache;
	List<IAccessor> accessors;
	
	public CacheManager(Cache cache,List<IAccessor> al){
		this.cache = cache;
		this.accessors  = al;
		initialize();
	}

	public void initialize() {
		Iterator<IAccessor> itr = accessors.iterator();
		
		while(itr.hasNext()) {
			IAccessor acc = itr.next();
			cache.put(acc.getKey(), acc.getData());
		}
	}
	
}
