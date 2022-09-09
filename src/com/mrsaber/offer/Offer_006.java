package com.mrsaber.offer;

public class Offer_006 {

    /**
     * 双指针
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while (left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left,right};
            }
            if(numbers[left] + numbers[right] > target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{};
    }

    /**
     * 二分查找
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSumII(int[] numbers, int target) {
       for(int i = 0;i < numbers.length;i++){
           int firstNum = numbers[i];
           int remain =  target - firstNum;

           int left = i,right =numbers.length-1;
           while (left < right){
               int mid = (left + right)/2 + 1;
               if(numbers[mid] == remain){
                   return new int[]{i,mid};
               }
               if(numbers[mid] > remain){
                   right = mid -1;
               }else{
                   left = left +1;
               }
           }
       }
        return new int[]{};
    }


    public static void main(String[] args) {
        new Offer_006().twoSumII(new int[]{1,2,3,4,4,9,56,90}, 8);
    }
}
