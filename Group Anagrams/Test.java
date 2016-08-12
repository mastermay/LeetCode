import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<List<String>> groupAnagrams = new Solution()
				.groupAnagrams(new String[] { "eat", "tea", "tan", "ate",
						"nat", "bat" });
		for (List<String> l : groupAnagrams) {
			for (String s : l) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
}