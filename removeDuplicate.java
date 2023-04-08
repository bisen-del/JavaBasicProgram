package com.company.JavaBasicProgram;

import java.util.ArrayList;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(remDupli(arr));
    }
    static ArrayList<Integer> remDupli(int[] arr){
        ArrayList<Integer> rem=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] != arr[j]) {
                    rem.add(arr[i]);
                    break;
                }

            }
        }
        return rem;
    }
}
