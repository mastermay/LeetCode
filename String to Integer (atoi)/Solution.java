public class Solution {
	public int myAtoi(String str) {
		long ret = 0;
		boolean isNegative = false;
		str = str.trim();
		int start = 0;
		if (str.length() == 0 || (str.length() > 1 && str.charAt(1) < '0')) {
			return 0;
		}
		if (str.charAt(start) < '0') {
			start = 1;
		}
		if (str.charAt(0) == '-') {
			isNegative = true;
		}

		for (; start < str.length(); start++) {
			int charAt = str.charAt(start) - '0';
			if (charAt > 9 || charAt < 0) {
				break;
			}
			ret = ret * 10 + charAt;
			if (isNegative && -ret <= Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			if (!isNegative && ret >= Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
		}

		if (isNegative) {
			ret = -ret;
		}

		return (int) ret;
	}
}