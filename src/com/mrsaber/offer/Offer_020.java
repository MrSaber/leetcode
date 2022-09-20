package com.mrsaber.offer;

public class Offer_020 {
    public int countSubstrings(String s) {
        int sum = 0;
        for(int i = 0;i< s.length();i++){
            sum = sum +  calcByCenterPos(s,i) + calcByCenterAndRightPos(s,i);
        }
        return sum;
    }

    public int calcByCenterPos(String str, int center){
        return expand(str, 1, center-1, center+1);
    }


    public int calcByCenterAndRightPos(String str, int center){
        int right = center+1;
        if(right >= str.length() || str.charAt(right) != str.charAt(center)){
            return 0;
        }
        return expand(str, 1, center -1, center + 2);
    }

    private int expand(String str, int count, int left, int right) {
        while (left>=0&&right<str.length()){
            if(str.charAt(left) != str.charAt(right)){
                return count;
            }
            count++;
            left--;
            right++;
        }
        return count;
    }


    public static void main(String[] args) {
        int aaa = new Offer_020().countSubstrings("aaaa");
        System.out.println(aaa);
    }
}
