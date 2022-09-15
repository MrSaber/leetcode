package com.mrsaber.offer;

import java.util.Arrays;

/**
 * 左右两边子数组的和相等
 */
public class Offer_012 {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int divide = 0, leftPtr = -1; divide < nums.length; divide++, leftPtr++) {
            if (leftPtr >= 0) {
                leftSum += nums[leftPtr];
            }
            if (total - leftSum - nums[divide] == leftSum) {
                return divide;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new Offer_012().pivotIndex(new int[]{1,7,3,6,5,6});
    }
}
