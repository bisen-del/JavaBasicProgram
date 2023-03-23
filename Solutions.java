package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solutions {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n-1;i++){
            s[i]=sc.nextLine();
        }
        int k=sc.nextInt();
        find(s,k);
    }
    static void find(String s[],int k){
        ArrayList<String> manu=new ArrayList<>();
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[j]==s[i]){
                    continue;
                }else{
                    manu.add(s[i]);
                }
            }
        }
        System.out.println(manu.get(k));
    }
}