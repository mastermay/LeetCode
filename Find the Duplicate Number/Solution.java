public class Solution {
	public int findDuplicate(int[] nums) {
		int min = 0, max = nums.length - 1, mid = 0, count = 0;
		while (min <= max) {
			mid = min + (max - min) / 2;
			count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] <= mid) {
					count++;
				}
			}
			if (count <= mid) {
				min = mid + 1;
			}
			if (count > mid) {
				max = mid - 1;
			}
		}
		return min;
	}
}