public class Solution {
	int max = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		dfs(root);
		return max;
	}

	public int dfs(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int sum = root.val;
		int lmax = dfs(root.left);
		int rmax = dfs(root.right);

		if (lmax > 0) {
			sum += lmax;
		}
		if (rmax > 0) {
			sum += rmax;
		}

		max = max > sum ? max : sum;

		return Math.max(lmax, rmax) > 0 ? Math.max(lmax, rmax) + root.val
				: root.val;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}