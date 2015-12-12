import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> array = new ArrayList<Integer>();
		if (candidates == null) {
			result.add(array);
			return result;
		}
		Arrays.sort(candidates);
		dfs(candidates, 0, target, array, result);
		return result;
	}

	private void dfs(int[] num, int start, int target, List<Integer> array,
			List<List<Integer>> result) {
		if (target == 0) {
			result.add(new ArrayList<Integer>(array));
			return;
		}
		if (start >= num.length || num[start] > target) {
			return;
		}
		int i = start;
		while (i < num.length && num[i] <= target) {
			array.add(num[i]);
			dfs(num, i + 1, target - num[i], array, result);
			array.remove(array.size() - 1);
			while (i < num.length - 1 && num[i] == num[i + 1]) {
				i++;
			}
			i++;
		}
	}
}