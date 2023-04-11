// Problem Statement
// One day jack finds a string of characters. He is very keen to arrange the characters in reverse order, i.e., first characters become the last characters, second characters become the second-last characters, and so on. Now he wants your help  to find the kth character from the new string formed after reverse the original string.

// Input Format
// The first line contains two integer n, k — the length of array and kth character of the string respectively.
// The second line contains a string containing n characters.
// Output Format
// Print the single line kth character of the string.

// Constraints
// 1 ≤ k ≤ n≤ 1000000
// String contain only lowercase Latin letters.
// Sample Testcase 0
// Testcase Input
// 5 2
// abdfa
// Testcase Output
// f
// Explanation
// The kth character after the reversing the string is f.

package com.company.JavaBasicProgram;

public class Findkth {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        // Input the length of the string and kth character
        int n = sc.nextInt();
        int k = sc.nextInt();

        // Input the string
        String str = sc.next();

        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Print the kth character of the reversed string
        System.out.println(reversedStr.charAt(k - 1));


    }
}
