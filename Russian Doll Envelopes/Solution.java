import java.util.Arrays;

public class Solution {
	public int maxEnvelopes(int[][] envelopes) {
		if (envelopes.length == 0)
			return 0;

		Arrays.sort(envelopes, (a1, a2) -> {
			if (a1[0] == a2[0])
				return a1[1] - a2[1];
			return a1[0] - a2[0];
		});

		int max = 0;
		int[] dp = new int[envelopes.length];

		for (int i = 0; i < envelopes.length; i++) {
			for (int j = 0; j < i; j++) {
				if (envelopes[i][0] > envelopes[j][0]
						&& envelopes[i][1] > envelopes[j][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			max = Math.max(max, dp[i]);
		}

		return max + 1;
	}

}