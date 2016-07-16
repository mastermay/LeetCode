public class Solution {
	public String countAndSay(int n) {
		if (n < 0)
			return "";
		String s = "1";
		for (int i = 1; i < n; i++) {
			System.out.println(s);
			s = convert(s);
		}
		return s;

	}

	private String convert(String s) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		char last = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == last) {
				count++;
			} else {
				sb.append(count);
				sb.append(last);
				count = 1;
				last = c;
			}
		}
		sb.append(count);
		sb.append(last);
		return sb.toString();
	}
}