package com.d3f4ult.frogjump;

public class FrogJump {

    public static void main(String[] args) {
        int [] stairs=new int[]{10,20,30,10};


        System.out.println(minEnergyUsed(stairs,3));

    }
    public  static  int minEnergyUsed(int []stairs,int n){
//        base case
        if(n==0){
            return  0;
        }
        var left=0;
        var right=0;
//        right recursion
         right+= minEnergyUsed(stairs,n-1)+Math.abs((stairs[n]-stairs[n-1]));
        System.out.println("right==> "+right);
        if(n>1){
             left+=minEnergyUsed(stairs,n-2)+Math.abs((stairs[n]-stairs[n-2]));
            System.out.println("left==> "+left); }
        return  Math.min(right,left);



    }
}

