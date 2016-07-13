[ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/)

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
```
P   A   H   N
A P L S I I G
Y   I   R
```
And then read line by line: `"PAHNAPLSIIGYIR"`
Write the code that will take a string and make this conversion given a number of rows:
```
string convert(string text, int nRows);
```
`convert("PAYPALISHIRING", 3)` should return `"PAHNAPLSIIGYIR"`.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

找规律，竖着的是等差，间隔为 
`2*(numRows-1)`，除了第一行和最后一行，中间还需要插入一个数字，跟左边差
距为 `2*(numRows-i-i)`，`i` 为行数。