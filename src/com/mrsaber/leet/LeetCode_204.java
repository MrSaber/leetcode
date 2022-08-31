package com.mrsaber.leet;

import java.util.Arrays;

/**
 * 204. 计数质数
 */
public class LeetCode_204 {
    public int countPrimes(int n) {
        boolean[] isPrimeArr = new boolean[n + 1];
        Arrays.fill(isPrimeArr, true);
        for (int i = 2; i <= n; i++) {
            if (isPrimeArr[i]) {
                for (int j = i * 2; j < n; j += i) {
                    isPrimeArr[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrimeArr[i]) {
                count++;
            }
        }
        return count;
    }
}

