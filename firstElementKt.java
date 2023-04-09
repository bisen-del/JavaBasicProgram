/*Given an array of N integers. Find the first element that occurs at least K number of times.*/
package com.company.JavaBasicProgram;

import java.util.HashMap;
import java.util.Map;

public class firstElementKt {
    public static void main(String[] args) {
        int[] a={3,4,4,2,4,3};
        int k=2;
        int n=a.length;
        System.out.println(fiRst(a,k,n));
    }
    static int fiRst(int[] a,int k,int n){
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);

            if (freqMap.get(a[i]) == k) {
                return a[i];
            }
        }
      return -1;
    }
}
