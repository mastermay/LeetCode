public class Solution {
	public int maximalRectangle(char[][] matrix) {
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int m = maximal(matrix, i, j);
				max = max > m ? max : m;
			}
		}
		return max;
	}

	private int maximal(char[][] matrix, int x, int y) {
		int yy = y;
		int max = 0;
		int lx = 0;
		int lym = Integer.MAX_VALUE;
		while (x < matrix.length && matrix[x][y] != '0') {
			int ly = 0;
			while (y < matrix[0].length && matrix[x][y] != '0') {
				ly++;
				y++;
			}
			lx++;
			lym = lym < ly ? lym : ly;
			max = max > lx * lym ? max : lx * lym;
			x++;
			y = yy;
		}
		return max;
	}
}