[Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/)

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:

1. You must not modify the array (assume the array is read only).
2. You must use only constant, `O(1)` extra space.
3. Your runtime complexity should be less than <code>O(n<sup>2</sup>)</code>.
4. There is only one duplicate number in the array, but it could be repeated more than once.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

方法1：

如果小于等于 `m` 的数字的个数大于 `m`，那么重复的数字小于等于 `m`。题中说明重复的只有一个数字，所以前面的结论反过来也成立，所以可直接使用二分来查找是那个数字。

方法2：

Reference: [Floyd's cycle-finding algorithm](https://en.wikipedia.org/wiki/Cycle_detection#Tortoise_and_hare)