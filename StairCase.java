/* You are jumping a staircase. It takes n steps to reach the top.

Each time you can either jump 1 or 2 steps. Print in how many distinct ways can you jump to the top?

Input Format
A single integer n.
Output Format
Print a single integer that denotes number of distinct ways to climb up.
Constraints
1 <= n <= 45
Sample Testcase 0
Testcase Input
2
Testcase Output
2
Explanation
There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Sample Testcase 1
Testcase Input
3
Testcase Output
3
Explanation
There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step */
    
    
    

package com.company.JavaBasicProgram;

import java.util.Arrays;
import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
