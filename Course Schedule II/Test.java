public class Test {
	public static void main(String[] args) {
		int[] findOrder = new Solution().findOrder(4, new int[][] { { 1, 0 },
				{ 2, 0 }, { 3, 1 }, { 3, 2 } });
		for (int i : findOrder) {
			System.out.println(i);
		}
	}
}