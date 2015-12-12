[Combination Sum II](https://leetcode.com/problems/combination-sum-ii/)

Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:

+ All numbers (including target) will be positive integers.
+ Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
+ The solution set must not contain duplicate combinations.

For example, given candidate set 10,1,2,7,6,1,5 and target 8, 

A solution set is: 

```
[1, 7] 
[1, 2, 5] 
[2, 6] 
[1, 1, 6] 
```

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

要求是从小到大输出，所以现将输入排下序。使用 DFS 即可，注意排除相同的即可。