//Each Christmas, the members of the royal family exchange gifts with each other. The family has n members numbered from 1 to n. However, not everyone in the family gives and receives the same number of gifts.

// The youngest member receives a gift from everyone else in the family except himself but does not give any gifts to anyone else. This Christmas, there were a total of m gifts that were exchanged among the family members. You are provided with the data for all m gifts. Find the number that represents the youngest family member using the given data.

// Input Format
// The first line of the input contains two integers n and m – the number of family members and the number of gifts that were exchanged.
// The next m lines contain two integers each. In the ith line, two integers ai, bi represent that a gift was given by ai to bi.
// Note: any ordered pair (ai, bi) will not occur more than once, i.e., a family member does not give more than one gift to the same member.
// Testcase Input
// 2 1
// 1 2
// Testcase Output
// 2

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
