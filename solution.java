package com.company;

public class solution {
    public static void main(String[] args) {
        int[] nums={10,2,4,12,6,14,16};
        System.out.println(findNumbers(nums));
    }
        public  static int  findNumbers(int[] nums) {
        int digit=0;
            for(int i=0;i<nums.length;i++){
                int count=0;
                while(nums[i]>0){
                    nums[i]=nums[i]/10;
                    count++;
                }
                if(count%2==0){
                    digit++;
                }

            }
            return digit;

        }
    }

