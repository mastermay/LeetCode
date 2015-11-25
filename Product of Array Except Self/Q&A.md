[Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)

Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

O(n) 的复杂度要求我们不能简单的对除自身外其他数字进行迭代操作。但是我们可以稍微变通一下，使用两个数组，一个保存某个数左侧数的乘积，一个保存右侧的乘积，这样便可以满足题目要求。