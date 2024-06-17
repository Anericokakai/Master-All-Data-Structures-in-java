package com.d3f4ult.ClimbingStairs;

import java.util.HashMap;

public class ClimbingStairs {
static HashMap<Integer,Long> cache=new HashMap<>();
static HashMap<Integer,Long> cache2=new HashMap<>();
    public static void main(String[] args) {


        System.out.println("\n <--------- Top DOWn Approach with memoization------>\n".toUpperCase());
        System.out.println(differentWays(0));


        System.out.println("\n <--------- Bottom  Up Approach/ Tabulation ------>\n".toUpperCase());
        System.out.println(diffWays(0));
    }




//   ! Top Down approach
    public  static  long differentWays(int n){
        if(cache.containsKey(n)){
            return  cache.get(n);
        }
        if(n==0) return  0;
        if(n==1)return  1;

        var results= differentWays(n-1)+differentWays(n-2);
        cache.put(n,results);
        return  results;

    }


//  !  bottom up approach
    public  static  long  diffWays(int n){
        long results=0;
        for (int i=1;i<=n;i++){
        if(i<=1){
            results=  1;
        }else if(i==2){
            results=2;
        } else  {
                results=cache2.get(i-1)+cache2.get(i-2);
            }
            cache2.put(i,results);
        }
        return  results;


    }
}
