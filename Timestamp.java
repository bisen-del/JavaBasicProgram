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
