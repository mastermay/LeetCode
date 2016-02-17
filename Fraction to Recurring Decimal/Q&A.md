[Fraction to Recurring Decimal](https://leetcode.com/problems/fraction-to-recurring-decimal/)

Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

For example,

+ Given numerator = 1, denominator = 2, return "0.5".
+ Given numerator = 2, denominator = 1, return "2".
+ Given numerator = 2, denominator = 3, return "0.(6)".

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

只要余数出现重复，那么循环体就是从第一次出现这个余数的时候开始。

> `StringBuilder` 连接结果可以稍微加快点速度。