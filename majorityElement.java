
package com.company.JavaBasicProgram;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] a={1,3,2,3,3,3,2,2,3};
        int size=a.length;
      majorityElement(a,size);
    }
    static void majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> manu=new HashMap<>();
        int i=0;
        for( i=0;i<size;i++){
            if(!manu.containsKey(a[i])){
                manu.put(a[i],1);
            }else{
                manu.put(a[i],manu.get(a[i])+1);
            }
        }
        int majority=-1;
        int maxcount=0;
       for(Map.Entry<Integer,Integer> entry: manu.entrySet()){
           int count=entry.getValue();
           if(count>maxcount){
              maxcount=count;
              majority=entry.getKey();

           }
       }
       if(maxcount>size/2){
           System.out.println(majority);
       }else{
           System.out.println(-1);
       }
    }
}
