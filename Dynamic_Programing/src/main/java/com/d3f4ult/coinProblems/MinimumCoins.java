package com.d3f4ult.coinProblems;

import java.util.HashMap;

public class MinimumCoins {
    public  static HashMap<Integer,Integer> cache= new HashMap<>();
    public static void main(String[] args) {
 var res=findMinCoin(11,new int[]{1,2,5});
        System.out.println(res);
        System.out.println(cache);

    }
    static  int findMin_ingoreNull(int a,int b){
        System.out.println("a--> "+a);
        System.out.println("b----> "+b);
        if(a==0) return b;
        if(b==0)return  a;
        return Math.min(a,b);

    }
   static int findMinCoin(int amount,int [] coins){
        int res=0;


        if(amount==0){
            res=0;
        }else {

          for (int coin:coins){
//              find the subProblem
              var subProblem=amount-coin;
//              System.out.println(subProblem);

              if(cache.containsKey(subProblem)){
                  res=cache.get(subProblem);
                  return  res;
              }
//              skip if it is less than zero

              if(subProblem<=0) continue;

              res=findMin_ingoreNull(res,findMinCoin(subProblem,coins)+1);
              cache.put(subProblem,res);


          }


        }
return res;
    }

}
