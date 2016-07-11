public class Test {
	public static void main(String[] args) {
		int[] num = { 1, 1, 2, 2, 3, 4, 4, 5 };
		num = new Solution().singleNumber(num);
		for (int i : num) {
			System.out.println(i);
		}
	}
}
