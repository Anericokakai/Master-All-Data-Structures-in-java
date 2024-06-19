package com.d3f4ult.frogjump;

import java.util.* ;
import java.io.*;
public class Solution {
    public static void main(String[] args) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        int[] arr = new int[]{1, 2, 4, 1, 3, 4, 5, 6, 3, 1, 2, 3, 4, 5, 5, 2, 2, 5, 7};

        for (int a : arr) {
            cache.put(a, cache.getOrDefault(a, 0) + 1);

        }
        System.out.println(cache);
    }



}