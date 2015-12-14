public class Solution {
	public int strStr(String haystack, String needle) {
		int length = needle.length();
		int index = 0, j = 0;
		for (; index <= haystack.length() - needle.length(); index++) {
			for (j = 0; j < length; j++) {
				if (haystack.charAt(index + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == length) {
				return index;
			}
		}
		return -1;
	}
}