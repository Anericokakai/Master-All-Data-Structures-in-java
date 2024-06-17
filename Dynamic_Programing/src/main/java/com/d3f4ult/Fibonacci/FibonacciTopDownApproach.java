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
// Using A hash Map;
    System.out.println("\n<-----------------Using hashMap to implement fibonacci-------->\n".toUpperCase());
    long res=fibonacci(50);
    System.out.println("The Fibonacci of 50  is "+res);


    System.out.println("\n<-----------------Using Arrays to implement fibonacci-------->\n".toUpperCase());
    int n=50;
    long [] memo=new long[n+1];
   var res2= FibonnaciArrayMethod(n,memo);
    System.out.println("The Fibonacci of "+n +" is equal to ==> "+ res2);

}
//HASH  MAP FIBONACCI IMPLEMENTATION
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

//! USING ARRAYS METHODS
    public  static  long FibonnaciArrayMethod(int n,long[] memo){
        if(memo[n]!=0){
            return  memo[n];
        }
    if(n<=2){
        return  1;
    }


      return memo[n]=  (FibonnaciArrayMethod(n-1 , memo)+FibonnaciArrayMethod(n-2,memo));

    }

}
