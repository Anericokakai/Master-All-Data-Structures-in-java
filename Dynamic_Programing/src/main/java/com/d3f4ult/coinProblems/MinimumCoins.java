package com.d3f4ult.coinProblems;

public class MinimumCoins {
    public static void main(String[] args) {
 var res=findMinCoin(11,new int[]{1,2,5});
        System.out.println(res);

    }
    static  int findMin_ingoreNull(int a,int b){
        if(a==0) return b;
        if(b==0)return  a;
        System.out.println( "Min max solurion = "+Math.min(a,b));
        return Math.min(a,b);
    }
   static int findMinCoin(int amount,int [] coins){
        int res=0;
        var total=0;
        if(amount==0){
            res=0;
        }else {

          for (int coin:coins){
//              find the subProblem
              var subProblem=amount-coin;
//              skip if it is less than zero

              if(subProblem<0) continue;


              res=findMin_ingoreNull(res,findMinCoin(subProblem,coins)+1);


          }


        }
//       if(total!=amount){
//           System.out.println("No match");
//       }
return res;
    }

}
