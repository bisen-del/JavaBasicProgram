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
