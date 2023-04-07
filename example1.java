/*You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.

Write a code that takes an array of integers and returns an array of the products.*/
/* Time Complexity O(n)^2*/

package com.company.JavaBasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=1;
        int[] brr=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            for( int k=0;k< arr.length;k++){
                if(k==j){
                    continue;
                }
                sum=sum*arr[k];

            }
            brr[j]=sum;
            sum=1;
        }
        System.out.println(Arrays.toString(brr));
    }
}
