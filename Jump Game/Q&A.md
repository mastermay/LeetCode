[Jump Game](https://leetcode.com/problems/jump-game/)

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
```
A = [2,3,1,1,4], return true.
A = [3,2,1,0,4], return false.
```
-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

1.若在任意 pos 位置出现 maxstep 为 0 的情况，则说明无法继续向前移动，返回 false
2.若在任意 pos 位置出现 maxstep+pos>=n 说明可以完成最后一跳，返回 true