package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Stack2 {
    public static void main(String[] args) {
       String exp="a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(find(exp));






    }
    static int prec(char ch){
        switch (ch){
            case'+':
            case'-':
                return 1;
            case'*':
            case'/':
                return 2;
            case'^':
                return 3;

        }
        return -1;
    }

    static <Char> String find(String exp){
        Stack<Character> manu=new Stack<>();
        String result="";
        char ch=' ';
        for(int i=0;i<exp.length();++i)
            ch=exp.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            result=result+ch;
        }else if(ch==')'){
            while(!manu.isEmpty()&&manu.peek()!='('){
                result +=manu.pop();
                manu.pop();
            }
        }else
            while(!manu.isEmpty()&&prec(ch)<=prec(manu.peek())){
                result += manu.pop();

            }
            manu.push(ch);
            return result;



    }




}
