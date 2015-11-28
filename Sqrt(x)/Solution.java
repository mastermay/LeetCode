public class Solution {
	public int mySqrt(int x) {
		if (x < 0) {
			return 0;
		}
		double x0 = (double) x / 2;
		double x1 = newton(x0, x);
		while ((int) x0 != (int) x1) {
			x0 = x1;
			x1 = newton(x1, x);
		}
		return (int) x0;
	}

	public double newton(double x, int a) {
		return x / 2.0 + a / 2.0 / x;
	}
}