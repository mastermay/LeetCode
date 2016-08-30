/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
	public int guessNumber(int n) {
		if (guess(n) == 0)
			return n;
		int l = 1;
		int h = n;
		while (l < h) {
			int m = l + (h - l) / 2;
			int g = guess(m);
			if (g == 0)
				return m;
			else if (g > 0)
				l = m + 1;
			else
				h = m - 1;
		}
		return l;
	}
}