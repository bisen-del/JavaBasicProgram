//Alice is a software developer, and she recently faced a bug that showed up weirdly. The bug constantly shows up a stream of numbers on her computer. The stream of numbers consists of zero and non-zero values. The only solution to this bug is to adjust the array so that all zeros move in the end and non-zero values come at the start. Here’s a catch: the relative ordering of the elements should be the same after modifying that stream. Can You Help Alice in resolving the bug??

// Input Format
// The first line of the input contains 'n' number of elements
// The following line contains an array of Integers – the elements in the stream.
//Output Format
// For each input-output, the suitable array.
// Constraints
// 1<=n<10^5
// -2^31<=arr[i]<=2^31-1
// Sample Testcase 0
// Testcase Input
// 5
// 0
// 1
// 0
// 3
// 12
// Testcase Output
// 1 3 12 0 0
//Explanation
// In the test case above, the stream of given numbers is readjusted so that All zeros come in the end.


package com.company.JavaBasicProgram;

import java.util.Scanner;

public class NonZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
