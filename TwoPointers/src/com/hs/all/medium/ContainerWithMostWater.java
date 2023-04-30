package com.hs.all.medium;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int res = 0;
		while (left < right) {
			int width = right - left;
			int area = width * Math.min(height[left], height[right]);
			res = Math.max(res, area);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		ContainerWithMostWater obj = new ContainerWithMostWater();
		int maxArea = obj.maxArea(arr);
		System.out.println(maxArea);
	}
}