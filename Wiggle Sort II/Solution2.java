public class Solution2 {
	public void wiggleSort(int[] nums) {
		double mid = quickSelect(nums, 0, nums.length - 1, nums.length / 2);
		int i = 0, j = 0, k = nums.length - 1, n = nums.length;
		while (j <= k) {
			if (nums[p(j, n)] > mid) {
				int temp = nums[p(i, n)];
				nums[p(i, n)] = nums[p(j, n)];
				nums[p(j, n)] = temp;
				i++;
				j++;
			} else if (nums[p(j, n)] < mid) {
				int temp = nums[p(j, n)];
				nums[p(j, n)] = nums[p(k, n)];
				nums[p(k, n)] = temp;
				k--;
			} else {
				j++;
			}
		}
	}

	private int p(int i, int n) {
		return (1 + 2 * i) % (n | 1);
	}

	private int quickSelect(int[] nums, int low, int high, int k) {
		int i = low, j = high;
		int temp;
		temp = nums[i];
		while (i < j) {
			while (i < j && nums[j] >= temp) {
				j--;
			}
			if (i < j) {
				nums[i++] = nums[j];
			}
			while (i < j && nums[i] < temp) {
				i++;
			}
			if (i < j) {
				nums[j--] = nums[i];
			}
		}
		nums[i] = temp;
		if (i == k) {
			return temp;
		}
		if (i > k) {
			return quickSelect(nums, low, i - 1, k);
		} else {
			return quickSelect(nums, i + 1, high, k);
		}
	}
}