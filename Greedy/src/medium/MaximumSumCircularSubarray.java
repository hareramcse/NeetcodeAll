package medium;

public class MaximumSumCircularSubarray {
	public int maxSubarraySumCircular(int[] nums) {
		int kadane = kadane(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] *= -1;
		}

		int inverseKadane = kadane(nums);
		if (sum + inverseKadane == 0)
			return kadane;
		return Math.max(kadane, sum + inverseKadane);
	}

	private int kadane(int[] nums) {
		int globalmax = Integer.MIN_VALUE;
		int currMax = 0;
		for (int i = 0; i < nums.length; i++) {
			currMax = Integer.max(currMax + nums[i], nums[i]);
			globalmax = Integer.max(globalmax, currMax);
		}
		return globalmax;
	}
}