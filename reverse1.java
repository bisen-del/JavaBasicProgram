package com.company;

public class reverse1 {
    public static boolean ispalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else
            return false;
    }

}
