package com.coding.challenges.hackerrank;

public class SherlockAndSquares {
    public static int squares(int a, int b) {
        int sqrtA = (int) Math.ceil(Math.sqrt(a)),
            sqrtB = (int) Math.floor(Math.sqrt(b));
       return sqrtB - sqrtA + 1;
    }
}
