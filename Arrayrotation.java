package com.company;

import java.util.Arrays;

public class Arrayrotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;
        rotate(arr,k);
    }
    static void rotate(int[] arr,int k){
     int p=1;
     while(p<=k){
          int last=arr[0];
          for(int i=0;i<arr.length-1;i++){
              arr[i]=arr[i+1];
          }
         arr[arr.length-1]=last;
          p++;
     }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

  /*  int temp[]=new int[arr.length];
    int d=0;
        for(int i=k;i<arr.length;i++){
        temp[d]=arr[i];
        d++;
        }
        for(int i=0;i<k;i++){
        temp[d]=arr[i];
        d++;
        }
        System.out.println(Arrays.toString(temp));

   */