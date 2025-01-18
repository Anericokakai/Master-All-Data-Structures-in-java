package com.d3f4ult.coinProblems;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumCoins {
    public  static HashMap<Integer,Integer> cache= new HashMap<>();
    public static void main(String[] args) {
        int amount=11;
        int []coins= new int[] {5,1,2};
        int n=0;
        int []ds= new int [coins.length];
        int sum=0;
 var res=findMinCoin(amount,coins);
        System.out.println(res);

    }
    static  int findMin_ingoreNull(int a,int b){
        System.out.println("a--> "+a);
        System.out.println("b----> "+b);
        if(a==0) return b;
        if(b==0)return  a;
        return Math.min(a,b);

    }
   static int findMinCoin(int amount,int [] coins){

int []dp=new int[amount+1];
Arrays.fill(dp,Integer.MAX_VALUE);
dp[0]=0;

for(int i=0;i<=amount;i++){
    for (int coin : coins){
        var subProblem= i-coin;
        if(subProblem>=0){
            int min = Math.min(dp[i], 1 + dp[subProblem]);

            dp[i]= min;

        }


    }

}

return  dp[amount];

    }

}
