/* Reena is given a basket array containing 2n fruits. She needs to pair these fruits into n pairs (a1,b1) ,( a2,b2).....,(an,bn) such that the sum of the min(ai,bi)
for all i is maximized.Print the maximized sum.

Input Format
First line contains a single even integer denoting the value of 2n;

Next line contains 2n space separated integers.

 

Output Format
Single integer denoting the maximum sum

Constraints
1 <= n <= 10^5
length == 2 * n
-10^4 <= nums[i] <= 10^4
Sample Testcase 0
Testcase Input
 6
5 3 2 1 6 3
Testcase Output
9
Explanation
As to get maximum sum in this case our answer would be
Min(1,2) + min(3,3) + min(5,6) = 9
Sample Testcase 1
Testcase Input
8
5 7 6 2 9 1 1 4
Testcase Output
15
Explanation
As to get maximum sum in this case our answer would be
Min(1,1) + min(2,4) + min(5,6) + min(7,9) = 15
*/  



package com.company.JavaBasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ReenaFruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int j=0;j<arr.length;j=j+2){
            sum+=arr[j];
        }
        System.out.println(sum);
    }
}
