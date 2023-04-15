package com.company.JavaBasicProgram;

import java.util.Scanner;

public class minimumDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(minimumD(arr,x,y));

    }
    static int minimumD(int[] arr,int x, int y){
        int i, j;
        int min_dist = Integer.MAX_VALUE;
        for (i = 0; i <arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if ((x == arr[i] && y == arr[j]
                        || y == arr[i] && x == arr[j])
                        && min_dist > Math.abs(i - j))
                    min_dist = Math.abs(i - j);
            }
        }
        if (min_dist > arr.length) {
            return -1;
        }
        return min_dist;
    }
}
