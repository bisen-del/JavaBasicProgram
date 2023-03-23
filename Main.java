package com.company;
 class Main {
    public static int findLargest(int[] arr,int num){
        int temp=0;
        for(int i=0;i<=num;i++) {
            for (int j = 0; i <= num; i++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[num-1];
    }

    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        int num=arr.length;
        System.out.println("largest element"+findLargest(arr,num));
    }
}

