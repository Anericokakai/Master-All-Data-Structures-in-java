package com.d3f4ult.frogjump;

import java.util.* ;
import java.io.*;
public class Solution {
    public static int jumpMin(int n,int [] heights,int [] cache){


        // Write your code here..
        // memoization
        if(cache[n]!=0){
            return cache[n];
        }
        if(n==0){
            return 0;
        }
        int left=jumpMin(n-1, heights,cache)+ Math.abs(heights[n]-heights[n-1]);
        var right=Integer.MAX_VALUE;
        if(n>1){
            right=jumpMin(n-2, heights,cache)+Math.abs(heights[n]-heights[n-2]);
        }


        cache[n]= Math.min(left,right);
        return cache[n];
    }
    public static int frogJump(int n, int heights[]) {

        int []cache = new int [n];
        int res=jumpMin(n-1, heights,cache);

        return res;


    }



}