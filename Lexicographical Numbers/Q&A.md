[Lexicographical Numbers](https://leetcode.com/problems/lexicographical-numbers/)

Given an integer n, return 1 - n in lexicographical order.

For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].

Please optimize your algorithm to use less time and space. The input size may be as large as 5,000,000.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

将所有的数字补全成相同的位数，向右使用 `x` 补全，然后将这个数字当作一个11进制的数字 （x<0）。