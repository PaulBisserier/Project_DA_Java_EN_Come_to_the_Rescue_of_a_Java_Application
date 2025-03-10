package com.hemebiotech.analytics;

import java.util.List;

/**
 * 
 * @author paul
 * retourne une map avec des clés : symptomes, et des valeurs : fréquence
 */

public class CounterSymptoms extends AbstractCounter implements ICountSymptoms {
		
	@Override
	public void count(final List<String> lines) {
	
	for (String symptom : lines) {
		if (!myMap.containsKey(symptom)) {
		myMap.put(symptom, 1);
		} else {
			myMap.put(symptom, myMap.get(symptom) +1);
	  }	
	 }
	}
	
}
