[Sqrt(x)](https://leetcode.com/problems/sqrtx/)

Implement int sqrt(int x).

Compute and return the square root of x.

-.-. --- -.. . -....- .. ... -....- .--. --- . - .-. -.--

参考牛顿法即可。[百度](http://baike.baidu.com/view/643093.htm)，[wiki](https://en.wikipedia.org/wiki/Newton%27s_method)

具体就是 x_(n+1) = x_n - f(x_n) / f'(x_n) //Tex: $$x_{n+1}=x_n-\frac{f(x_n)}{f'(x_n)}$$