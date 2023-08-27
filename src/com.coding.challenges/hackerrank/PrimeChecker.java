package com.coding.challenges.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= 4; i++) {
            BigInteger num = BigInteger.valueOf(sc.nextInt());
            if (num.isProbablePrime(10)) {
                sb.append(num).append(" ");
            }
            if (i == 3) continue;
            System.out.println(sb);
        }
    }
}
