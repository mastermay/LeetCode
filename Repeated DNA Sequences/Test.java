import java.util.List;

public class Test {
	public static void main(String[] args) {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> results = new Solution().findRepeatedDnaSequences(s);
		for (String ss : results) {
			System.out.println(ss);
		}
	}
}