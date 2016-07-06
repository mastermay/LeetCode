import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<String>> partition(String s) {

		boolean p[][] = new boolean[s.length()][s.length()];

		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)
						&& (j - i < 2 || p[i + 1][j - 1])) {
					p[i][j] = true;
				}
			}
		}
		List<String> r = new ArrayList<>();
		List<List<String>> result = new ArrayList<>();

		dfs(0, s, p, r, result);

		return result;
	}

	private void dfs(int start, String s, boolean p[][], List<String> a,
			List<List<String>> result) {
		if (start == s.length()) {
			result.add(new ArrayList<>(a));
			return;
		}
		for (int i = start; i < s.length(); i++) {
			if (p[start][i]) {
				a.add(s.substring(start, i + 1));
				dfs(i + 1, s, p, a, result);
				a.remove(a.size() - 1);
			}
		}
	}
}