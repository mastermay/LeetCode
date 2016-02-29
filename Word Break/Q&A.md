[Word Break](https://leetcode.com/problems/word-break/)

Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

用一个 `boolean` 数组表示从开始到第 `i` 位能否分割。