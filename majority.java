package com.company;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class majority {
    public static void main(String[] args) {
        int[] arr={2,2,3,2,1,2,2};
        System.out.println( findMjority(arr));
    }
    static int findMjority(int arr[]){
        int ans=-1;
        HashMap<Integer,Integer> manu=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(manu.containsKey(arr[i])){
                manu.put(arr[i],manu.get(arr[i]+1));
            }else{
                manu.put(arr[i],1);
            }
            if(manu.get(arr[i])>arr.length/2){
                ans=arr[i];
            }
            return ans;

        }
        return -1;

    }
}
