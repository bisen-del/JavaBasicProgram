package com.company;

public class Stack1 {
    public static class Stack{
        int[] arr;
        int top;

        public Stack(int size) {
            this.arr=new int[size];
            this.top=-1;
            System.out.println("stack is created of size:-"+size);
        }
        public boolean isEmpty(){
            if(top==-1)
               return true;
            else
               return false;
        }
        public boolean isfull(){
            if (top==arr.length-1)
                return true;
            else
                return false;
        }
        public void push(int num){
            if(isfull()){
                System.out.println("stack is full");
            }
            arr[top+1]=num;
            top++;
            System.out.println("Value is successfully inserted");

        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }else
            {
                int topof=arr[top];
                top--;
            }
            return top;
        }


    }
    public static void main(String[] args) {
        Stack manu=new Stack(4);
        manu.push(2);
        manu.push(3);
        manu.push(4);
        manu.push(5);
        System.out.println(manu.pop());


        System.out.println(manu.isEmpty());
        System.out.println(manu.isfull());


    }
}
