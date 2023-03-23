package com.company;

public class hangama {
    public static void main(String[] args) {
        String str="My  name is manish";
        char manu;
        String name="";
        for (int i=0;i<str.length();i++){
            manu=str.charAt(i);
            name=manu+name;
        }
        System.out.println(name);

    }
}
