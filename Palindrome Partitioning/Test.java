import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<List<String>> r = new Solution().partition("aab");

		for (List<String> l : r) {
			for (String s : l) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}
