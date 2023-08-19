package com.coding.challenges.hackerrank;

public class HalloweenSale {
    public static int howManyGames(int p, int d, int m, int s) {
        int sum = p,
                games = 0,
                ex;
        while (sum <= s) {
            if (sum + p > s) {
                break;
            }
            ex = p - d;
            if (ex < m) {
                ex = m;
            }
            sum += ex;
            p = ex;
            games++;
        }
        if (p > s) {
            return 0;
        } else {
            return games;
        }
    }
}
