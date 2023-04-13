package com.company.JavaBasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ReenaFruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int j=0;j<arr.length;j=j+2){
            sum+=arr[j];
        }
        System.out.println(sum);
    }
}
