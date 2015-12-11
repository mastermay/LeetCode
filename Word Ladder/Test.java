import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		HashSet<String> wordList = new HashSet<String>();
		String[] words = { "hot", "dot", "dog", "lot", "log" };
		for (String s : words) {
			wordList.add(s);
		}
		String beginWord = "hit";
		String endWord = "cog";
		System.out.println(new Solution().ladderLength(beginWord, endWord,
				wordList));
	}
}