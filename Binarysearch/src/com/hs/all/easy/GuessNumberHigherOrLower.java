package com.hs.all.easy;

public class GuessNumberHigherOrLower {
	public int guessNumber(int n) {
		// return a num between 1,...,n
		int low = 1;
		int high = n;

		while (true) {
			int mid = low + (high - low) / 2;
			int myGuess = guessNumber(mid);
			if (myGuess == 1)
				low = mid + 1;
			else if (myGuess == -1)
				high = mid - 1;
			else
				return mid;
		}
	}
}
