package com.company;

import java.util.Scanner;

public class sorta {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element");
        int n=sc.nextInt();
        int arr[]=new int[5];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Array elements are");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
