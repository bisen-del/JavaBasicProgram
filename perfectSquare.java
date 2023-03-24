/*You might know some pretty large perfect squares. But what about the NEXT one?

Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer
n such that sqrt(n) is also an integer.If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.*/


package com.company;

public class perfectSquare {
    public static void main(String[] args) {
        int n=121;
        System.out.println(findNextSquare(n));
    }
    public static long findNextSquare(long sq) {

        int n=(int)Math.sqrt(sq);
        if(n*n!=sq){
            return -1;
        }else{
            n=n+1;
        }

        return n*n;
    }

}
