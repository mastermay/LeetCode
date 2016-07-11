import java.util.Arrays;

public class Solution {
	public void wiggleSort(int[] nums) {
		Arrays.sort(nums);
		int[] temp = new int[nums.length];

		int j = temp.length - 1;
		for (int i = 1; i < nums.length; i += 2, j--) {
			temp[i] = nums[j];
		}
		for (int i = 0; i < nums.length; i += 2, j--) {
			temp[i] = nums[j];
		}
		System.arraycopy(temp, 0, nums, 0, temp.length);
	}
}
// Your runtime beats 88.46% of java submissions.