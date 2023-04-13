package com.company.JavaBasicProgram;

import java.util.Scanner;

public class ListOfToys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  // read the number of toys produced
        int[] products = new int[n];  // initialize an array to store the product IDs
        int[] sizes = new int[n];  // initialize an array to store the sizes of the toys

        for (int i = 0; i < 2*n; i++) {
            if (i < n) {
                products[i] = input.nextInt();  // read the first n integers as product IDs
            } else {
                sizes[i-n] = input.nextInt();  // read the next n integers as sizes of the corresponding toys
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(products[i] + " " + sizes[i] + " ");  // print the product ID and size of each toy
        }

        input.close();
    }
}
