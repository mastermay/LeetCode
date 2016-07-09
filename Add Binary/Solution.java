public class Solution {
	public String addBinary(String a, String b) {
		char sums[];
		int len1 = a.length();
		int len2 = b.length();
		int len = len1 > len2 ? len1 : len2;
		sums = new char[len + 1];
		int p = len;
		int carry = 0;
		int i = len1 - 1, j = len2 - 1;
		for (; i >= 0 && j >= 0; i--, j--) {
			int t = a.charAt(i) + b.charAt(j) - '0' + carry;
			if (t >= '2') {
				carry = 1;
				t = t - 2;
			} else {
				carry = 0;
			}
			sums[p] = (char) t;
			p--;
		}

		for (; i >= 0; i--) {
			int t = a.charAt(i) + carry;
			if (t >= '2') {
				carry = 1;
				t = t - 2;
			} else {
				carry = 0;
			}
			sums[p] = (char) t;
			p--;
		}
		for (; j >= 0; j--) {
			int t = b.charAt(j) + carry;
			if (t >= '2') {
				carry = 1;
				t = t - 2;
			} else {
				carry = 0;
			}
			sums[p] = (char) t;
			p--;
		}
		int offset = 1;
		if (carry == 1) {
			sums[p] = '1';
			offset = 0;
		}
		return new String(sums, offset, len + 1 - offset);
	}
}