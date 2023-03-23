package com.company;

import java.util.Scanner;

public class basic{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a= sc.nextInt();
            if(a==0||a==1) {
                System.out.println("it's prime number");
            }
            int k=0;
            for(int i=2;i<a;i++){
                if(a%i==0){
                    System.out.println("It's is not a prime number ");
                    k++;
                }
            }
                if(k==0){
                    System.out.println("It's a prime number");
                }

    }
}