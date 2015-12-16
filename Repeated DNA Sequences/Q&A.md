[Repeated DNA Sequences](https://leetcode.com/problems/repeated-dna-sequences/)

All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

> Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

> Return:

> ["AAAAACCCCC", "CCCCCAAAAA"].

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

参考[这里](https://leetcode.com/discuss/24478/i-did-it-in-10-lines-of-c)，使用两个 `bit` 分别表示 ATCG，长度为10的字符串使用 `int` 存储，通过 `HashMap` 判断是第几次出现。需要注意的就是返回值里不能有重复的。