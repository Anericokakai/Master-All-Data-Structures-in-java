package com.d3f4ult.Fibonacci;

import java.util.HashMap;

public class FibonacciBottomUpApproach {
    public static  HashMap<Integer,Long> cache=new HashMap<>();

    public static void main(String[] args) {
      var fRes= fibonacci(5);
        System.out.println(fRes);
    }
    /**
     * loop through the numbers if 50  starting from the base i.e 1
     * */
public  static long fibonacci(int n){
    long res=0;


//    for loop
    for (int i=1;i<=n;i++){
        //    base case
        if(i<=2){
            res=1;
        }
        else  {
          res=cache.get(i-1)+cache.get(i-2)  ;
        }
        cache.put(i,res);

    }
    return res;
}


}
