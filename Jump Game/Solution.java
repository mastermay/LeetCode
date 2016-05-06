public class Solution {
	public boolean canJump(int[] nums) {
		int n = nums.length;
		if (n == 0 || n == 1) {
			return true;
		}
		int maxstep = nums[0];
		for (int i = 1; i < n; i++) {
			if (maxstep == 0)
				return false;
			maxstep--;
			if (maxstep < nums[i]) {
				maxstep = nums[i];
			}
			if (maxstep + i >= n - 1) {
				return true;
			}
		}
		return false;
	}
}