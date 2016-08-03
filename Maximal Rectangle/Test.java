public class Test {

	public static void main(String[] args) {
		int maximalRectangle = new Solution().maximalRectangle(new char[][] {
				{ '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' },
				{ '1', '1', '1', '1', '1' }, { '1', '0', '0', '1', '0' } });
		System.out.println(maximalRectangle);
	}
}