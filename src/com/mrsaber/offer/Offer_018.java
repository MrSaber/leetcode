package com.mrsaber.offer;

import java.util.Objects;

public class Offer_018 {
    public boolean isPalindrome(String s) {
        if(Objects.isNull(s)||s.length()<1){
            return true;
        }
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for(Character ch : s.toCharArray()){
            if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')){
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }

    public boolean isPalindromeII(String s) {
        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();
        while (left <= right){
            while (left<right&&!((s.charAt(left)>='0'&&s.charAt(left)<='9')||(s.charAt(left)>='a'&&s.charAt(left)<='z'))){
                left++;
            }
            while (left<right&&!((s.charAt(right)>='0'&&s.charAt(right)<='9')||(s.charAt(right)>='a'&&s.charAt(right)<='z'))){
                right--;
            }
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean palindromeII = new Offer_018().isPalindromeII(" ");
        System.out.println(palindromeII);
    }
}
