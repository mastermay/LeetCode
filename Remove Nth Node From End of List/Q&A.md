[Remove Nth Node From End of List](https://leetcode.com/submissions/detail/73178829/)

Given a linked list, remove the nth node from the end of list and return its head.

For example,
```
   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
```
Note:
Given `n` will always be valid.
Try to do this in one pass.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

双指针，一个指向表头，一个指向第 `n-1` 个节点，同时右移直至第二个指针到达末尾。