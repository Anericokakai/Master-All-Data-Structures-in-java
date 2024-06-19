package com.d3f4ult.coinProblems;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumCoins {
    public  static HashMap<Integer,Integer> cache= new HashMap<>();
    public static void main(String[] args) {
        int amount=11;
        int []coins= new int[] {3,1,2};
        int n=0;
        int []ds= new int [coins.length];
        int sum=0;
 var res=findMinCoin(amount,coins,n,ds,sum);
        System.out.println(res);

    }
    static  int findMin_ingoreNull(int a,int b){
        System.out.println("a--> "+a);
        System.out.println("b----> "+b);
        if(a==0) return b;
        if(b==0)return  a;
        return Math.min(a,b);

    }
   static int findMinCoin(int amount,int [] coins,int n,int []ds,int sum){
        int res=0;

if(n>=coins.length){
    System.out.println(Arrays.toString(ds));
    System.out.println(sum);
    return 0 ;
}
        if(amount==0){
          return   0;
        }
        if(sum==amount){
            System.out.println(Arrays.toString(ds));

            return ds.length;
        }
        ds[n]=coins[n];
        sum+=coins[n];
        findMinCoin(amount,coins,n+1,ds,sum);
        ds[n]=0;
        sum-=coins[n];
 findMinCoin(amount,coins,n+1,ds,sum);








return res;
    }

}
