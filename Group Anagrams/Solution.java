import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String ss = String.valueOf(c);
			if (!map.containsKey(ss)) {
				List<String> l = new ArrayList<String>();
				l.add(s);
				map.put(ss, l);
			} else {
				map.get(ss).add(s);
			}
		}

		return new ArrayList<>(map.values());
	}
}