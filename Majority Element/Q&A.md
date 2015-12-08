[Majority Element](https://leetcode.com/problems/majority-element/)

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

参考摩尔投票法

一个简单的原理，取出两个数字，假设这两个数字不一样，那么除去这两个数字，剩余的数组的 Majority Element 不会变。

一次遍历，使用 `ans` `count` 分别记录当前的 Majority Element 以及它的个数，