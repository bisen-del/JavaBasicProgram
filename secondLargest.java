/*print second largest distinct element from an array using HashSet.*/
package com.company.JavaBasicProgram;

import java.util.HashSet;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr={9,5,3,2,1};
        System.out.println(secLargest(arr));
    }
    static int secLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int secmin=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int num:set){
            if(num>max){
                secmin=max;
                max=num;
            }
        }
        return secmin;
    }
}
