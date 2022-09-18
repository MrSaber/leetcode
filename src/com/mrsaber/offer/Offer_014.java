package com.mrsaber.offer;

import java.util.Arrays;

public class Offer_014 {

    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){return false;}
        //[a] 解构S1
        int[] charArr = new int[26];
        int[] processArr = new int[26];
        for(int i = 0; i < s1.length();i++){
            charArr[s1.charAt(i)-'a']++;
            processArr[s2.charAt(i)-'a']++;
        }

        //[b] 计算是否包含这么多字母
        int left = 0;
        int right = s1.length()-1;
        while (right<s2.length()){
            if(Arrays.equals(charArr,processArr)){
                return true;
            }
            processArr[s2.charAt(left++)-'a']--;
            right++;
            if(right>=s2.length()){
                return false;
            }
            processArr[s2.charAt(right)-'a']++;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = new Offer_014().checkInclusion("ab", "aab");
        System.out.println(b);
    }


}
