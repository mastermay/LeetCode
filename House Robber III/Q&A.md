[House Robber III](https://leetcode.com/problems/house-robber-iii/)

The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root." Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree". It will automatically contact the police if two directly-linked houses were broken into on the same night.

Determine the maximum amount of money the thief can rob tonight without alerting the police.

Example 1:
```
     3
    / \
   2   3
    \   \ 
     3   1
```
Maximum amount of money the thief can `rob = 3 + 3 + 1 = 7`.

Example 2:
```
     3
    / \
   4   5
  / \   \ 
 1   3   1
```
Maximum amount of money the thief can `rob = 4 + 5 = 9`.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

使用`dp1[node]`表示选择`node`节点的最大值，`dp2[node]`表示不选择`node`节点的最大值。
```
dp1[node] = node.val + dp2[node.left] + dp2[node.right];
dp2[node] = max(dp1[node.left], dp2[node.left]) + max(dp1[node.right], dp2[node.right]);
```
使用 DFS 遍历，最终的结果就是 `max(dp1[root], dp2[root])`。