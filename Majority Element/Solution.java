public class Solution {
	public int majorityElement(int[] nums) {
		int num = 0, count = 0;
		for (int i : nums) {
			if (count == 0 || i == num) {
				num = i;
				count++;
			} else {
				count--;
			}
		}
		return num;
	}
}