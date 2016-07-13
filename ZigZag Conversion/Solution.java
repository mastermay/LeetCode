public class Solution {
	public String convert(String s, int numRows) {
		if (numRows < 2) {
			return s;
		}
		int len = s.length();
		char c[] = new char[s.length()];
		int lag = (numRows - 1) * 2;
		int count = 0;
		for (int i = 0; i < numRows; i++) {
			for (int j = i; j < len; j += lag) {
				c[count] = s.charAt(j);
				count++;
				if (i > 0 && i < numRows - 1) {
					int p = j + (numRows - i - 1) * 2;
					if (p < len) {
						c[count] = s.charAt(p);
						count++;
					}
				}
			}
		}
		return new String(c);
	}
}