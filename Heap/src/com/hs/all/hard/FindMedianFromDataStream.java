package com.hs.all.hard;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream {
	private Queue<Integer> minHeap; // large elements - minHeap
	private Queue<Integer> maxHeap; // small elements - maxHeap

	public FindMedianFromDataStream() {
		minHeap = new PriorityQueue<>((a, b) -> a - b);
		maxHeap = new PriorityQueue<>((a, b) -> b - a);
	}

	public void addNum(int num) {
		maxHeap.add(num);
		if (maxHeap.size() - minHeap.size() > 1 || !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
			minHeap.add(maxHeap.poll());
		}
		if (minHeap.size() - maxHeap.size() > 1) {
			maxHeap.add(minHeap.poll());
		}
	}

	public double findMedian() {
		if (maxHeap.size() == minHeap.size()) {
			return (double) (minHeap.peek() + maxHeap.peek()) / 2;
		} else if (maxHeap.size() > minHeap.size()) {
			return (double) maxHeap.peek();
		} else {
			return (double) minHeap.peek();
		}
	}
}