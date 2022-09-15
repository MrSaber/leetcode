package com.mrsaber.offer;

import java.util.HashMap;
import java.util.Map;

public class Offer_011 {
    public int findMaxLength(int[] nums) {
        int[] prefixArr = new int[nums.length];
        int prefixVal= 0 ;
        //[1] 算一下前缀和
        for(int i = 0; i < nums.length;i++){
            prefixVal+=nums[i];
            prefixArr[i] = prefixVal;
        }

        //[2] 求最长的
        int maxLen  = 0;
        for(int right = 0;right < nums.length;right++){
           for(int left = 0;left < right;left++){
               int len = right - left + 1 ;
               if(len %2!=0){
                   continue;
               }
               if((prefixArr[right]  - prefixArr[left] + nums[left])== len/2){
                   maxLen = Math.max(len,maxLen);
               }
           }
        }
        return maxLen;
    }

    /**
     * 把 0 看作 -1 ，转换问题
     * @param nums
     * @return
     */
    public int findMaxLengthII(int[] nums) {
        int maxLen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int counter = 0;
        map.put(counter,-1);
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]== 1){
                counter++;
            }else{
                counter--;
            }
            if(map.containsKey(counter)){
                int prevIndex = map.get(counter);
                maxLen = Math.max(maxLen,i - prevIndex);
            }
            else{
                map.put(counter,i);
            }
        }
        return maxLen;
        // -1 1 -1 1 1 -1 -1
    }


    public static void main(String[] args) {
        int maxLength = new Offer_011().findMaxLength(new int[]{0, 1, 0});
        System.out.println(maxLength);
    }
}
