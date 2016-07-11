public class Test {
	public static void main(String[] args) {
		int[] num = { 9, 8, 7, 6, 5, 4, 3, 2 };
		new Solution2().wiggleSort(num);
		for (int i : num) {
			System.out.println(i);
		}
	}
}
