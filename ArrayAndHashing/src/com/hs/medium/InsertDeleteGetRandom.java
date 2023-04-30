package com.hs.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsertDeleteGetRandom {
	private Map<Integer, Integer> indexing;
	private List<Integer> numbers;

	public InsertDeleteGetRandom() {
		this.indexing = new HashMap<>();
		this.numbers = new ArrayList<>();
	}

	// Append to the end, maintain indexing
	// Delete by swapping with the end, maintain indexing
	// Get random by getting a random index wrt list's size
	public boolean insert(int val) {
		if (indexing.containsKey(val)) 
			return false;
		
		int index = numbers.size();
		numbers.add(val);
		indexing.put(val, index);
		return true;
	}

	public boolean remove(int val) {
		if (!indexing.containsKey(val)) 
			return false;

		int lastIndex = numbers.size() - 1;
		int lastElement = numbers.get(lastIndex);
		int indexElement = indexing.get(val);

		// Swap with last element
		numbers.set(indexElement, lastElement);

		// Update indices [Add & Delete]
		indexing.put(lastElement, indexElement);
		indexing.remove(val);

		// Remove from list
		numbers.remove(lastIndex);
		return true;
	}

	public int getRandom() {
		int randomIndex = (int) (Math.random() * numbers.size());
		return numbers.get(randomIndex);
	}
}