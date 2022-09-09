package com.mrsaber.offer;

import java.math.BigDecimal;

public class Offer_002 {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        String longStr=  a.length() >=b.length()?a:b;
        String shortStr= a.length() < b.length()?a:b;
        int longPtr = longStr.length()-1;
        int shortPtr= shortStr.length() -1;
        int leftPad = 0;
        while (shortPtr>=0){
            int tmp = longStr.charAt(longPtr--)-'0' + shortStr.charAt(shortPtr--)-'0' + leftPad;
            if(tmp>1){
                tmp-=2;
                leftPad =1;
            }else{
                leftPad =0;
            }
            result.append(tmp);
        }
        while (longPtr>=0){
            int tmp = longStr.charAt(longPtr--)-'0' + leftPad;
            if(tmp>1){
                tmp-=2;
                leftPad =1;
            }else{
                leftPad =0;
            }
            result.append(tmp);
        }
        if(leftPad==1){
            result.append(1);
        }
        result.reverse();
        int firstOnePos = result.indexOf("1");
        if(firstOnePos < 0){
            return "0";
        }
        return result.substring(firstOnePos);
    }

    public static void main(String[] args) {
        String s = new Offer_002().addBinary("111", "111");
        System.out.println(s);
    }
}
