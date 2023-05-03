package medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		backtrack(n, k, 1, list, ans); // start from 1 instead of 0 as mentioned in question
		return ans;
	}

	public void backtrack(int n, int k, int ind, List<Integer> list, List<List<Integer>> ans) {
		if (list.size() == k) {
			ans.add(new ArrayList<>(list));
			return;
		}

		for (int i = ind; i <= n; i++) {
			list.add(i);
			backtrack(n, k, i + 1, list, ans);
			list.remove(list.size() - 1);
		}
	}
}