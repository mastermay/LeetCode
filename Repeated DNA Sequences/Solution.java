import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> results = new ArrayList<String>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int key = 0;
		for (int i = 0; i < s.length(); i++) {
			key = key << 2 & 0xfffff | ((int) s.charAt(i) - 64) % 5;
			if (i < 9)
				continue;
			if (map.containsKey(key)) {
				if (map.get(key) == 1) {
					results.add(s.substring(i - 9, i + 1));
					map.put(key, 2);
				}
			} else {
				map.put(key, 1);
			}
		}
		return results;
	}
}