import java.util.Arrays;

public class Solution2 {
	public int maxEnvelopes(int[][] envelopes) {
		if (envelopes.length == 0)
			return 0;

		Arrays.sort(envelopes, (a1, a2) -> {
			if (a1[0] == a2[0])
				return a2[1] - a1[1];
			return a1[0] - a2[0];
		});

		int len = 0;
		int[] dp = new int[envelopes.length];

		for (int i = 0; i < envelopes.length; i++) {

			int l = 0, r = len - 1;
			while (l <= r) {
				int m = (l + r) / 2;
				if (dp[m] < envelopes[i][1]) {
					l = m + 1;
				} else {
					r = m - 1;
				}
			}
			dp[l] = envelopes[i][1];
			if (l == len) {
				len++;
			}
		}

		return len;
	}
}
