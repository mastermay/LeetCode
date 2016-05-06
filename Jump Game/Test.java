public class Test {
	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 4, 5 };
		int[] nums2 = { 1, 2, 1, 0, 4 };
		System.out.println(new Solution().canJump(nums));
		System.out.println(new Solution().canJump(nums2));

		System.out.println(new Solution2().canJump(nums));
		System.out.println(new Solution2().canJump(nums2));
	}
}
