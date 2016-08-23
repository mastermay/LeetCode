import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> lexicalOrder(int n) {
		int k = 0;
		int m = n;
		while (m != 0) {
			k++;
			m /= 10;
		}
		int length = (int) Math.pow(11, k);
		int[] nums = new int[length];

		for (int i = 1; i <= n; i++) {
			nums[convert(i, k)] = i;
		}

		List<Integer> list = new ArrayList<>();
		for (int i : nums) {
			if (i != 0) {
				list.add(i);
			}
		}
		return list;
	}

	private int convert(int i, int k) {
		int c = 0;
		int b = 1;
		for (int j = 0; j < k; j++) {
			if (i != 0) {
				c += (i % 10 + 1) * b;
				b *= 11;
				i /= 10;
			} else {
				c *= 11;
			}
		}
		return c;
	}
}