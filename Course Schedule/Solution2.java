public class Solution2 {
	private int[] visited;

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		visited = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			if (visited[i] == 0) {
				if (!visit(i, prerequisites))
					return false;
			}
		}
		return true;
	}

	private boolean visit(int i, int[][] prerequisites) {
		visited[i] = -1;
		for (int[] p : prerequisites) {
			if (p[0] == i) {
				if (visited[p[1]] == -1) {
					return false;
				} else {
					if (visited[p[1]] == 0 && !visit(p[1], prerequisites)) {
						return false;
					}
				}
			}
		}
		visited[i] = 1;
		return true;
	}
}