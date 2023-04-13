package com.company.JavaBasicProgram;

import java.util.Scanner;

public class WrongIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String decision = input.nextLine().trim();  // read the input and remove any leading/trailing spaces
        input.close();

        int Index = -1;  // initialize the index of the first wrong decision to -1

        for (int i = 1; i < decision.length(); i++) {
            if (decision.charAt(i) == 'W' && decision.charAt(i-1) == 'C') {
                Index = i;
                break;
            }
        }

        System.out.println(Index);
    }
}
