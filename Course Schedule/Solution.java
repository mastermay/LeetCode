import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		Queue<Integer> q = new LinkedList<>();
		int[] map = new int[numCourses];
		int[] res = new int[numCourses];
		for (int[] p : prerequisites) {
			map[p[1]]++;
		}
		int index = numCourses - 1;
		for (int i = 0; i < numCourses; i++) {
			if (map[i] == 0) {
				q.add(i);
				res[index--] = i;
			}
		}

		while (!q.isEmpty()) {
			int k = q.poll();
			for (int[] p : prerequisites) {
				if (p[0] == k) {
					map[p[1]]--;
					if (map[p[1]] == 0) {
						q.add(p[1]);
						res[index--] = p[1];
					}
				}
			}
		}
		return index == -1;
	}
}