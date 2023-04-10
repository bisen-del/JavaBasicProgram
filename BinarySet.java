// Suman is a laborious college boy and he is very good at mathematics. He is doing his assignment of computer science but he is not able to solve one coding problem.This problem consists of an integer, N and Suman has to find out the total number of set bits in all numbers starting from 1 to N.

// Suman needs your help in solving the problem.

// Input Format
// First and only one line of the input contains one integer N.

// Output Format
// Print an integer - the total number of set bits in all the numbers starting  from 1 to N.

// Constraints
// 0<N<=10^7
// Sample Testcase 0
// Testcase Input
// 5
// Testcase Output
// 7


package com.company.JavaBasicProgram;

public class BinarySet {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int i=0;i<=n;i++){
            String b=Integer.toBinaryString(i);
            for(int j=0;j<b.length();j++){
                if(b.charAt(j)=='1'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
