public class Solution {
	public int[] singleNumber(int[] nums) {
		int xor = 0;
		for (int i : nums) {
			xor ^= i;
		}
		int a = 0, b = 0;
		int lowbit = xor & -xor;
		for (int i : nums) {
			if ((i & lowbit) == 0) {
				a ^= i;
			} else {
				b ^= i;
			}
		}
		return new int[] { a, b };
	}
}