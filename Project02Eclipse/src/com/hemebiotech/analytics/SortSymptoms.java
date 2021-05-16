package com.hemebiotech.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author paul
 * reçoit une map et retourne une nouvelle map classée par ordre alphabétique
 *
 */
public class SortSymptoms extends AbstractCounter implements ISortMap {

	@Override
	public void sortMap(Map<String, Integer> mapToSort) {
					
	 		mapSorted = mapToSort.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.collect(Collectors.toMap(
					Map.Entry::getKey, 
					Map.Entry::getValue, 
					(oldValue, newValue) -> oldValue, LinkedHashMap::new));
	}

}
