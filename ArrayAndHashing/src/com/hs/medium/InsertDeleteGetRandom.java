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
		if (this.indexing.containsKey(val)) {
			return false;
		}
		int indexInsert = this.numbers.size();
		this.numbers.add(val);
		this.indexing.put(val, indexInsert);
		return true;
	}

	public boolean remove(int val) {
		if (!this.indexing.containsKey(val)) {
			return false;
		}

		int lastIndex = this.numbers.size() - 1;
		int lastElement = this.numbers.get(lastIndex);
		int indexElement = this.indexing.get(val);

		// Swap with last element
		this.numbers.set(indexElement, lastElement);

		// Update indices [Add & Delete]
		this.indexing.put(lastElement, indexElement);
		this.indexing.remove(val);

		// Remove from list
		this.numbers.remove(lastIndex);
		return true;
	}

	public int getRandom() {
		int randomIndex = (int) (Math.random() * this.numbers.size());
		return this.numbers.get(randomIndex);
	}
}
