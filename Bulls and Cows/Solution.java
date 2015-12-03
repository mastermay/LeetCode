public class Solution {
	public String getHint(String secret, String guess) {
		int bull = 0;
		int cow = 0;
		int[] s = new int[10];
		int[] g = new int[10];
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				bull++;
			} else {
				s[secret.charAt(i) - '0']++;
				g[guess.charAt(i) - '0']++;
			}
		}

		for (int i = 0; i < 10; i++) {
			s[i] = s[i] > g[i] ? g[i] : s[i];
			cow += s[i];
		}

		return bull + "A" + cow + "B";
	}
}