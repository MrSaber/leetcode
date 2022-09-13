package com.mrsaber.offer;

public class Offer_009 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int right = 0;right < nums.length;right++){
           int left = right;
           int sum  = nums[right];
           while (sum<k){
               count++;
               left--;
               if(left <0){
                   break;
               }
               sum*=nums[left];
           }
        }
        return count;
    }

    public int numSubarrayProductLessThanKII(int[] nums, int k) {
        int left = 0,right = 0,count =0,sum=1;
        for(;right < nums.length;right++){
            sum*=nums[right];
            while(left <= right && sum>=k){
                sum/=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int i = new Offer_009().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
        System.out.println(i);
    }
}
