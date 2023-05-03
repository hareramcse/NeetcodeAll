package medium;

import java.util.ArrayList;
import java.util.List;

// we can select the same number any number of times.
public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		backtrack(candidates, target, 0, candidates.length, ans, new ArrayList<>());
		return ans;
	}

	private void backtrack(int[] arr, int target, int i, int n, List<List<Integer>> ans, List<Integer> list) {
		if (i == n) {
			if (target == 0) {
				ans.add(new ArrayList<>(list));
			}
			return;
		}

		if (arr[i] <= target) {
			list.add(arr[i]);
			backtrack(arr, target - arr[i], i, n, ans, list);
			list.remove(list.size() - 1);
		}
		backtrack(arr, target, i + 1, n, ans, list);
	}
}