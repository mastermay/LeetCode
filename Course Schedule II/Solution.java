import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		int[] res = new int[numCourses];
		int[] map = new int[numCourses];
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < prerequisites.length; i++) {
			map[prerequisites[i][1]]++;
		}
		int index = numCourses - 1;
		for (int i = 0; i < numCourses; i++) {
			if (map[i] == 0) {
				q.add(i);
				res[index--] = i;
			}
		}

		while (!q.isEmpty()) {
			int k = q.remove();
			for (int i = 0; i < prerequisites.length; i++) {
				if (k == prerequisites[i][0]) {
					map[prerequisites[i][1]]--;
					if (map[prerequisites[i][1]] == 0) {
						q.add(prerequisites[i][1]);
						res[index--] = prerequisites[i][1];
					}
				}
			}
		}
		if (index != -1) {
			return new int[0];
		}
		return res;

	}
}