### The Fibonacci Series  
<b>0,1,1,2,3,5,8,13,............  </b>
  
The Fibonacci sequence begins with <b>0</b> and <b>1</b>.  
These are the first and second terms, respectively.  
After this, every element is the sum of the preceding elements:

#### Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2) 


<b>Therefore</b>,  
<b>  
Fibonacci(n)&nbsp;&nbsp;&nbsp;&nbsp;= 0 , n = 1  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;= 1 , n = 2  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;= Fibonacci(n-1) + Fibonacci(n-2)  , n > 2
</b>

#####Problem  
Find the <b>nth</b> Fibonacci number.

##### Example  
fibonacci(3) = (0+1) = 1  
fibonacci(4) = (1+1) = 2  
fibonacci(5) = (1+2) = 3 