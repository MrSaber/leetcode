package com.mrsaber.offer;

import java.util.HashMap;

/**
 * 剑指 Offer II 010. 和为 k 的子数组
 */
public class Offer_010 {
    /**
     * 暴力检索（★）
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        int right = 0;
        int count = 0;
        // 整数数组
        for(;right < nums.length;right++){
            int sum = 0 ;
            int left  =right;
            //[b] 若不等
            while (left>=0&&left<=right){
                sum+=nums[left];
                if(sum == k){
                    count++;
                }
                left--;
            }
        }
        return count;
    }

    /**
     * 前缀和（★★★★★）
     * @param nums
     * @param k
     * @return
     */
    public int subarraySumII(int[] nums, int k) {
        int right = 0;
        int count = 0;
        int sum  = 0;
        HashMap<Integer,Integer> valueMap = new HashMap<>();
        valueMap.put(0,1);
        for(;right<nums.length;right++){
            sum+=nums[right];
            if(valueMap.containsKey(sum - k)){
                count+=valueMap.get(sum - k);
            }
            valueMap.put(sum,valueMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
