/* Java program for swap a number without using a 3rd variable */

package com.company;

public class Swap {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a+" "+"b:"+b);
    }
}
