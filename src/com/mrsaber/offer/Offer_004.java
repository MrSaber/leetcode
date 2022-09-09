package com.mrsaber.offer;

public class Offer_004 {

    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i =0;i<32;i++){
            int sum = 0;
            for(int j =0;j<nums.length;j++){
                sum+=nums[j]&1;
                nums[j]>>=1;
            }
            System.out.println(sum);
            if(sum%3!=0){
                result = result|(1<<i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new Offer_004().singleNumber(new int[]{2, 2, 3, 2});
        System.out.println(i);
    }
}
