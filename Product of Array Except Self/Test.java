public class Test {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 4 };
		int[] solutions = new Solution().productExceptSelf(input);
		for (int i : solutions) {
			System.out.println(i);
		}
	}
}
