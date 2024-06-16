package com.d3f4ult.Fibonacci;

import java.util.HashMap;

public class FibonacciTopDownApproach {

/**
 * first two numbers are  equal to one
 * recursively call the function adding the  two numbers
 * F(n-i)+ F(n-2)
 *
 **/
private static final HashMap<Integer,Long> cache=new HashMap<>();

public static void main(String[] args) {
    long res=fibonacci(50);
    System.out.println("The Fibonacci of 50  is "+res);
}
public  static  long fibonacci(int n){
long res=0;
//MEMOIZATION
    if(cache.containsKey(n)){
        return  cache.get(n);
    }
//BASE CASE
if(n<=2){
    return  1;
}
//!Recursion

  res= fibonacci(n-1)+fibonacci(n-2)  ;
//cache the results
    cache.put(n,res);
return res;
}

}
