package com.hs.easy;

public class CanPlaceFlowers {
	public boolean canPlaceFlowers(Integer[] flowerbed, int n) {
		if (n == 0)
			return true;

		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
				int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;

				if (prev == 0 && next == 0) {
					flowerbed[i] = 1;
					n--;
				}
				
				if (n == 0) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		CanPlaceFlowers obj = new CanPlaceFlowers();
		Integer[] arr = { 1, 0, 0, 0, 1 };
		boolean result = obj.canPlaceFlowers(arr, 1);
		System.out.println(result);
	}
}