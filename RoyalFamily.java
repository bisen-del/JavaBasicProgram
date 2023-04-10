package com.company.JavaBasicProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoyalFamily {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // number of family members
        int m = input.nextInt(); // number of gifts exchanged

        Map<Integer, Integer> giftsGiven = new HashMap<>(); // counts gifts given by each member
        Map<Integer, Integer> giftsReceived = new HashMap<>(); // counts gifts received by each member

        for (int i = 0; i < m; i++) {
            int giver = input.nextInt();
            int receiver = input.nextInt();
            if (giver != 1) {
                // count gifts given by everyone except the youngest
                giftsGiven.put(giver, giftsGiven.getOrDefault(giver, 0) + 1);
            }
            // count gifts received by everyone
            giftsReceived.put(receiver, giftsReceived.getOrDefault(receiver, 0) + 1);
        }

        int youngest = -1;
        for (int i = 2; i <= n; i++) {
            // the youngest member doesn't give any gifts, but receives n-1 gifts
            if (!giftsGiven.containsKey(i) && giftsReceived.getOrDefault(i, 0) == n-1) {
                youngest = i;
                break;
            }
        }

        System.out.println(youngest);
    }
}
