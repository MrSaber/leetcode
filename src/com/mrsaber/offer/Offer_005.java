package com.mrsaber.offer;

import java.util.Arrays;

public class Offer_005 {

    public int maxProduct(String[] words) {
        int[] masks = new int[words.length];
        for(int i = 0;i < words.length; i++){
            int mask = 0;
            for(char ch : words[i].toCharArray()){
                mask|=(1<<(ch-'a'));
            }
            masks[i] = mask;
        }

        int maxVal = -1;
        for(int i = 0;i < words.length;i++){
            int len = words[i].length();
            for(int j=i+1;j<words.length;j++){
               if((masks[i]&masks[j])==0){
                   maxVal = Math.max(maxVal,len*words[j].length());

               }
            }
        }
        return maxVal;
    }
}
