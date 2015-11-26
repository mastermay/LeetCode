[Sort List](https://leetcode.com/problems/sort-list/)

Sort a linked list in O(n log n) time using constant space complexity.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

链表排序，时间复杂度 O(n log n)，使用归并排序。思路如下：

1. 将链表分成两半： left, right（因为无法随机访问链表元素）
2. 分别对 left, right 进行排序（递归）
3. 将排序后的 left, right 合并成一个链表