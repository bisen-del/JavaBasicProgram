/* Given an unsorted array arr[] and two numbers x and y, find the minimum distance between x and y in arr[]. The array might also contain duplicates.
You may assume that both x and y are different and present in arr[].

Examples: 

Input: arr[] = {1, 2}, x = 1, y = 2
Output: Minimum distance between 1 
and 2 is 1.
Explanation: 1 is at index 0 and 2 is at 
index 1, so the distance is 1

Input: arr[] = {3, 4, 5}, x = 3, y = 5
Output: Minimum distance between 3 
and 5 is 2.
Explanation:3 is at index 0 and 5 is at 
index 2, so the distance is 2 */

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
