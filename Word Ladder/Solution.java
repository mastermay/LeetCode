import java.util.LinkedList;
import java.util.Set;

public class Solution {
	public int ladderLength(String beginWord, String endWord,
			Set<String> wordList) {
		LinkedList<Word> queue = new LinkedList<Word>();
		queue.add(new Word(beginWord, 1));
		wordList.add(endWord);
		while (!queue.isEmpty()) {
			Word top = queue.remove();
			String word = top.word;
			if (word.equals(endWord)) {
				return top.steps;
			}
			char[] arr = word.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				for (char c = 'a'; c <= 'z'; c++) {
					char temp = arr[i];
					if (arr[i] != c) {
						arr[i] = c;
					}
					String newWord = new String(arr);
					if (wordList.contains(newWord)) {
						queue.add(new Word(newWord, top.steps + 1));
						wordList.remove(newWord);
					}
					arr[i] = temp;
				}
			}
		}
		return 0;
	}

	class Word {
		String word;
		int steps;

		public Word(String word, int steps) {
			this.word = word;
			this.steps = steps;
		}
	}
}