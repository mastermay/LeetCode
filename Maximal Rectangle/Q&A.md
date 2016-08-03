[Maximal Rectangle](https://leetcode.com/problems/maximal-rectangle/)

Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

For example, given the following matrix:
```
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
```
Return 6.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

遍历每个点，求出以当前点为左上角的长方形的最大值。