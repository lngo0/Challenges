package com.coding.challenges.hackerrank;

public class ChocolateFeast {
    public static int chocolateFeast(int n, int c, int m) {
        int total = n/c, w = total;
        if (w < m) {
           return total;
        } else {
            while (w >= m) {
                total = total + 1;
                w = w - m + 1;
            }
            return total;
        }
    }
}
