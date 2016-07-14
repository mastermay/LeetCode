public class Solution2 {

	public int rob(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int f[] = dfs(root);
		return Math.max(f[0], f[1]);
	}

	private int[] dfs(TreeNode root) {
		if (root == null) {
			return new int[] { 0, 0 };
		}
		int l[] = dfs(root.left);
		int r[] = dfs(root.right);

		int res[] = new int[2];

		res[0] = root.val + l[1] + r[1];
		res[1] = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
		return res;
	}
}

// 跟 Solution.java 思路一样，速度快点。