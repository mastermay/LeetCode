public class Test {
	public static void main(String[] args) {
		int[] nums = { 1, 5, 7, 7, 6, 4, 8, 9, 2, 3 };
		System.out.println(new Solution().findDuplicate(nums));
		System.out.println(new Solution2().findDuplicate(nums));
	}
}