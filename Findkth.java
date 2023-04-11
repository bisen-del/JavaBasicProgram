package com.company.JavaBasicProgram;

public class Findkth {
    public static void main(String[] args) {
        StringBuilder manu=new StringBuilder("programming");
        int k=4;
        StringBuilder m=manu.reverse();
        for(int i=0;i<manu.length();i++){
            if(i==k){
                System.out.println(m.charAt(i));
            }
        }


    }
}
