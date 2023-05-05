package medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		backTrack(nums, 0, ans, new ArrayList<>());
		return ans;
	}

	private void backTrack(int[] nums, int i, List<List<Integer>> ans, List<Integer> list) {
		if (i == nums.length) {
			ans.add(new ArrayList<>(list));
			return;
		}

		list.add(nums[i]);
		backTrack(nums, i + 1, ans, list);
		list.remove(list.size() - 1);

		backTrack(nums, i + 1, ans, list);
	}

	public static void main(String[] args) {
		Subsets obj = new Subsets();
		int[] arr = { 3, 2, 1 };
		List<List<Integer>> result = obj.subsets(arr);
		for (List<Integer> list : result) {
			System.out.print(list);
		}
	}
}