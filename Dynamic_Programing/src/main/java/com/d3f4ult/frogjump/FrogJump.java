package com.d3f4ult.frogjump;

public class FrogJump {

    public static void main(String[] args) {
        int [] stairs=new int[]{10 ,20 ,30, 10};
        int [] cache=new int[stairs.length+1];


        System.out.println(minEnergyUsed(stairs,3,cache));
        System.out.println(minEn(stairs,3));

    }
//    ! TOP DOWN APPROACH
    public  static  int minEnergyUsed(int []stairs,int n,int [] cache){
//        base case
        if(n==0){
            return  0;
        }
//        memoization
        if(cache[n]!=0){
            return cache[n];
        }
        var left=minEnergyUsed(stairs,n-1,cache)+Math.abs(stairs[n]-stairs[n-1]);
        var right=Integer.MAX_VALUE;


        if(n>1){
        right= minEnergyUsed(stairs,n-2,cache)+Math.abs(stairs[n]-stairs[n-2]);
        }
        var res= Math.min(left,right);
        cache[n]=res;
        return res;



    }
//     ! BOTTOM UP APPROACH WITH TABULATION

    public  static  int minEn(int stairs[],int n){
        var res=0;

        var prev=0;
        var prev2=0;
        for (int i=1;i<=n;i++){


            var left=prev+ Math.abs(stairs[i]-stairs[i-1]);
            var right=Integer.MAX_VALUE;
            if(i>1) {
                right= prev2+Math.abs(stairs[i]-stairs[i-2]);}

             res=Math.min(left,right);
            prev2=prev;
            prev=res;


        }

        return  prev;
    }
}

