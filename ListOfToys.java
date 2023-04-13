/* A toy manufacturing factory produced n toys on a day. The manager has a list of product IDs and another list containing the sizes of the corresponding toys of length n each.
In other words, the ith integer in the product sizes list represents the size of the ith toy in the product ID list. He accidentally added the second list in front of the first
one and now has a list of 2*n elements.

 

You are an employee, and the manager wants you to recover the data and present it to him as another list of 2*n elements such that the product ID of each toy is followed by its size.

Input Format
The first line of the input contains a single integer n – the number of toys produced.

The second contains 2*n space-separated integers a1, a2, …, an, b1, b2, …, bn – the merged list given to you by the manager.

Output Format
Print 2*n space-separated integers representing the list wanted by the manager

Constraints
1 <= n <= 105

1 <= ai, bi<= 100

Sample Testcase 0
Testcase Input
3
2 5 1 3 4 7
Testcase Output
2 3 5 4 1 7 
Sample Testcase 1
Testcase Input
4
1 2 3 4 4 3 2 1
Testcase Output
1 4 2 3 3 2 4 1 
*/

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
