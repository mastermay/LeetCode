import java.util.HashMap;
import java.util.Map;

public class Solution {
	Map<TreeNode, Integer> dp1 = new HashMap<>();
	Map<TreeNode, Integer> dp2 = new HashMap<>();
	final TreeNode EMPTY = new TreeNode(0);

	public int rob(TreeNode root) {
		if (root == null) {
			return 0;
		}
		dp1.put(EMPTY, 0);
		dp2.put(EMPTY, 0);
		dfs(root);
		return Math.max(dp1.get(root), dp2.get(root));
	}

	private void dfs(TreeNode root) {
		if (root == null) {
			return;
		}
		dfs(root.left);
		dfs(root.right);

		if (root.left == null) {
			root.left = EMPTY;
		}
		if (root.right == null) {
			root.right = EMPTY;
		}

		dp1.put(root, root.val + dp2.get(root.left) + dp2.get(root.right));

		int maxLeft = Math.max(dp1.get(root.left), dp2.get(root.left));
		int maxRight = Math.max(dp1.get(root.right), dp2.get(root.right));

		dp2.put(root, maxLeft + maxRight);
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
