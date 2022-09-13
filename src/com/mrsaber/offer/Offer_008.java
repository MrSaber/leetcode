package com.mrsaber.offer;

/**
 * 长度最小的子数组
 */
public class Offer_008 {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, left = 0, right = 0;
        int minRange = Integer.MAX_VALUE;
        for (; right < nums.length; right++) {
            sum += nums[right];
            if (sum >= target) {
                while (sum >= target && left <= right) {
                    sum -= nums[left];
                    left++;
                }
                minRange = Math.min(minRange, right - left + 2);
            }
        }
        return minRange == Integer.MAX_VALUE?0:minRange;
    }

    public static void main(String[] args) {
        int i = new Offer_008().minSubArrayLen(3, new int[]{1,4,4});
        System.out.println(i);
    }
}
