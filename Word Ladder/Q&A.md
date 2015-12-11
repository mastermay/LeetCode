[Word Ladder](https://leetcode.com/problems/word-ladder/)

Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

1. Only one letter can be changed at a time
2. Each intermediate word must exist in the word list

For example,

> Given:
> beginWord = "hit"
> endWord = "cog"
> wordList = ["hot","dot","dog","lot","log"]
> As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
> return its length 5.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

使用 BFS 遍历，如果第二次访问到某个单词，那么第一次访问它的路径更短，所以可以将访问过的单词直接从集合中删除即可。