package medium;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int sum = 0;

		for (int num : nums) {
			if (sum < 0)
				sum = 0;

			sum += num;
			max = Math.max(max, sum);
		}
		return max;
	}

	public static void main(String[] args) {
		MaximumSubarray obj = new MaximumSubarray();
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = obj.maxSubArray(nums);
		System.out.println(result);
	}
}
