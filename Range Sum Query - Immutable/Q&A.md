[Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
```
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
```
Note:

1. You may assume that the array does not change.
2. There are many calls to sumRange function.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

要求是 `sumRange` 会调用多次，所以不能每次调用的时候再遍历。

计算从 `nums` 第 0 位到第 `i` 位的和保存在 `sum[i]` 中，则
```
sumRange(i, j) = i == 0 ? sum[j] : sum[j] - sum[i-1];
```