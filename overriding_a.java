package com.company;

import java.util.HashSet;

public class overriding_a{
    public static void main(String[] args) {
        String s="manish bisen";
        int a=s.length();
        char[] a1=s.toCharArray();
        System.out.println(count(s,a1));
    }
  static int count(String s,char[] a1){
        int count1=0;
      HashSet<String> manu=new HashSet<String>();
      for(int i=0;i< a1.length;i++){
          manu.add(String.valueOf(a1[i]));
          count1++;
      }
      return count1;

  }
}
