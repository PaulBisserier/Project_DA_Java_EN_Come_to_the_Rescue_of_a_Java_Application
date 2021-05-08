package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractCounter {
	
	protected final Map<String, Integer> myMap = new HashMap<String, Integer>();
	
	public Map<String, Integer> getMyMap() {
		return myMap;
	}
}
