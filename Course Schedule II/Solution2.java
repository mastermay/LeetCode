import java.util.Stack;

public class Solution2 {
	private int[] visited;
	Stack<Integer> res = new Stack<>();

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		visited = new int[numCourses];

		for (int i = 0; i < numCourses; i++) {
			if (visited[i] == 0)
				if (!visit(i, prerequisites))
					return new int[0];
		}

		int[] ret = new int[res.size()];
		for (int i = 0; i < res.size(); i++) {
			ret[i] = res.get(i);
		}
		return ret;
	}

	private boolean visit(int n, int[][] prerequisites) {
		visited[n] = -1;
		for (int i = 0; i < prerequisites.length; i++) {
			if (prerequisites[i][0] == n) {
				int l = prerequisites[i][1];
				if (visited[l] == -1) {
					return false;
				} else if (visited[l] == 0 && !visit(l, prerequisites)) {
					return false;
				}
			}
		}
		visited[n] = 1;
		res.push(n);
		return true;
	}
}
