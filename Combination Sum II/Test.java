import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<List<Integer>> result = new Solution().combinationSum2(candidates,
				target);
		for (List<Integer> r : result) {
			System.out.print("[ ");
			for (Integer i : r) {
				System.out.print(i + " ");
			}
			System.out.println("]");
		}
	}
}