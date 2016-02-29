import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<String> wordDict = new HashSet<String>();
		wordDict.add("Leet");
		wordDict.add("code");
		String s = "Leetcode";
		System.out.println(new Solution().wordBreak(s, wordDict));
	}
}
