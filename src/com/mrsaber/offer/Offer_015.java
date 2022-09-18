package com.mrsaber.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer_015 {

    public List<Integer> findAnagrams(String s1, String s2) {
        List<Integer> result = new ArrayList<>();
        if(s2.length() < s1.length()){return result;}
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
                 result.add(left);
            }
            processArr[s2.charAt(left++)-'a']--;
            right++;
            if(right>=s2.length()){
              break;
            }
            processArr[s2.charAt(right)-'a']++;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> anagrams = new Offer_015().findAnagrams("ab", "aab");
        System.out.println(anagrams);
    }


}
