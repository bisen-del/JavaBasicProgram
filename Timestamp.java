// Steve is doing some competitive coding, but at any second ‘t’ when he made any submission, the previous submission, which was done 5000 seconds ago, will remove itself from the submission queue. He wants to calculate the maximum queue size he will get at any time ‘t’ after total 'n' submissions.

// Help Steve to find the maximum size of queue.

// Note: It is guaranteed that every submission uses a strictly larger value of ‘t’ than the previous submission.

 

// Input Format
// The first line of input consists of n– the size of array.

// The second line consists of an array of n integers.

// Output Format
// Output a single line containing the maximum size possible.

// Constraints
// 1 <= n <= 10^5

// 1 <= arr[i] <= 10^8

 

// Sample Testcase 0
// Testcase Input
// 4
// 1 100 5000 5002

// Testcase Output
// 3
// Explanation
// At an index 2 and 3 the queue size is maximum  i.e. 3. 


 package com.company.JavaBasicProgram;

 import java.util.Scanner;

public class Timestamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of array
        int n = sc.nextInt();

        // Input the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize variables
        int front = 0, rear = 0, maxQueueSize = 0;

        // Traverse the array
        while (rear < n) {
            if (arr[rear] - arr[front] <= 5000) {
                // If submission at rear is within 5000 seconds of submission at front,
                // increase the size of the queue and move rear pointer
                rear++;
            } else {
                // If submission at rear is more than 5000 seconds after submission at front,
                // remove submission at front and move front pointer
                front++;
            }
            maxQueueSize = Math.max(maxQueueSize, rear - front);
        }

        // Print the maximum size of the queue
        System.out.println(maxQueueSize);
    }
}
