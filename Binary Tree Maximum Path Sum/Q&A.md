[Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/)

Given a binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path does not need to go through the root.

For example:
Given the below binary tree,
```
       1
      / \
     2   3
```
Return 6.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

到当前节点为止，最长的路径 = 左子树的最长(if >0) + 当前节点 + 右子树的最长(if >0)，保存当前找到的最长路径。

递归查找所有节点，每个节点的最长路径 = 左/右子树的最长(if >0) + 当前节点。