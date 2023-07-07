/* sorting using Bubble sort*/



package com.company.JavaBasicProgram;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int arr[]={5,0,1,3,8,6,4};
        System.out.println(Arrays.toString(sort(arr)));


    }
    public static int[] sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
