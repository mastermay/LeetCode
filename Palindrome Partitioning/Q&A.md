[Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/)

Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return
```
[
  ["aa","b"],
  ["a","a","b"]
]
```
-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

DFS 遍历。

首先计算出从 i 到 j 的字串是否为回文，p[i][j] = s[i]==s[j] && p[i+1][j-1] (DP)