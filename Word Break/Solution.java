import java.util.Set;

public class Solution {
	public boolean wordBreak(String s, Set<String> wordDict) {
		int length = s.length();
		boolean flag[] = new boolean[length + 1];
		flag[0] = true;
		for (int i = 0; i < length; i++) {
			if (flag[i]) {
				for (int j = 1; j < length - i + 1; j++) {
					if (wordDict.contains(s.substring(i, i + j))) {
						flag[i + j] = true;
					}
				}
			}
		}
		return flag[length];
	}
}