package com.mrsaber.offer;

import java.util.HashSet;
import java.util.Set;

public class Offer_016 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> processSet = new HashSet<>();
        int right = -1;
        int ans = 0;
        for(int i =0;i <s.length();i++) {
            if (i != 0) {
                processSet.remove(s.charAt(i - 1));
            }
            while (right + 1 < s.length() && !processSet.contains(s.charAt(right + 1))) {
                processSet.add(s.charAt(right + 1));
                right++;
            }

            ans = Math.max(ans, right - i + 1);
        }
         return ans;
    }

    public static void main(String[] args) {
        int bbbb = new Offer_016().lengthOfLongestSubstring("pwwkew");
        System.out.println(bbbb);
    }
}
