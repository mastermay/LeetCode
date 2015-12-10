public class Solution {
	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}
		int low = prices[0];
		int profit = 0;
		for (int price : prices) {
			if (price < low) {
				low = price;
			} else if (profit < price - low) {
				profit = price - low;
			}
		}
		return profit;
	}
}