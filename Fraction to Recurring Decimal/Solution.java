import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String fractionToDecimal(int numerator, int denominator) {
		StringBuilder ans = new StringBuilder();
		if ((numerator < 0) ^ (denominator < 0) && numerator != 0) {
			ans.append("-");
		}
		long n = numerator, d = denominator;
		n = Math.abs(n);
		d = Math.abs(d);

		long res = n / d;
		ans.append(res);

		long rem = n % d * 10;
		if (rem == 0) {
			return ans.toString();
		}

		ans.append(".");
		Map<Long, Integer> map = new HashMap<Long, Integer>();

		while (rem != 0) {
			if (map.containsKey(rem)) {
				int begin = map.get(rem);
				String left = ans.substring(0, begin);
				String right = ans.substring(begin);
				return left + "(" + right + ")";
			}
			map.put(rem, ans.length());
			res = rem / d;
			ans.append(res);
			rem = rem % d * 10;
		}

		return ans.toString();
	}
}