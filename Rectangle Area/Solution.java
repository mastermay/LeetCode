import java.lang.Math;

public class Solution {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G,
			int H) {
		int total = (C - A) * (D - B) + (G - E) * (H - F);
		int AA = Math.max(A, E), BB = Math.max(B, F), CC = Math.min(C, G), DD = Math
				.min(D, H);
		if (AA >= CC || BB >= DD) {
			return total;
		}
		int cover = (CC - AA) * (DD - BB);
		return total - cover;
	}
}