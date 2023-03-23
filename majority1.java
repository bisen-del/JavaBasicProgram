package com.company;
import java.util.*;
import java.util.HashMap;

public class majority1 {

        static int majorityNumber(int arr[], int n) {
            int ans = -1;
            HashMap<Integer,
                    Integer> manu=new HashMap<Integer,
                    Integer>();

            for (int i = 0; i < n; i++) {
                if (manu.containsKey(arr[i])) {
                    manu.put(arr[i], manu.get(arr[i]) + 1);
                } else {
                    manu.put(arr[i], 1);
                }
                if (manu.get(arr[i]) > n / 2)
                    ans = arr[i];
            }
            return ans;
        }

        public static void main(String[] args) {
            int a[] = {3, 3, 1, 3, 1, 3, 2};
            int n = a.length;
            System.out.println(majorityNumber(a, n));
        }
    }
