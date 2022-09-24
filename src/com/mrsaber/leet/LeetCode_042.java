package com.mrsaber.leet;

public class LeetCode_042 {
    public int solution(int[] nums){
        int maxHeight  = -1;
        int maxPos = 0;
        //找最大值
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >= maxHeight){
                maxHeight = nums[i];
                maxPos = i;
            }
        }
        //找左边最大的
        int leftMax = nums[0];
        int rightMax = nums[nums.length-1];

        int result = 0;
        for(int i = 0; i < maxPos ;i++){
            if(nums[i] < leftMax){
                result += (leftMax - nums[i]);
            }else{
                leftMax = nums[i];
            }
        }

        for(int i = nums.length-1; i > maxPos ;i--){
            if(nums[i] < rightMax){
                result += (rightMax - nums[i]);
            }else{
                rightMax = nums[i];
            }
        }
        return result;
    }
}
