package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPwd {
    static int minimumNumber(int n, String password) {
        int min = 0;
        int rulesCount = 4;
        boolean atLeastSizeChars = n >= 6;
        boolean lowerCase = password.matches(".*[a-z]+.*");
        boolean upperCase = password.matches(".*[A-Z]+.*");
        boolean digit = password.matches(".*[0-9]+.*");
        boolean specialChars = password.matches(".*[!@#\\$%\\^&\\*()\\-\\+]+.*");

        if (lowerCase) {
            rulesCount--;
        }
        if (upperCase) {
            rulesCount--;
        }
        if (digit) {
            rulesCount--;
        }
        if (specialChars) {
            rulesCount--;
        }
        if (!atLeastSizeChars) {
            min = 6 - n;
            rulesCount = (rulesCount < min) ? 0 : rulesCount - min;
        }
        min += rulesCount;

        return min;

    }
    static int minimumNumber2(int n, String password) {
        Matcher matchingCases = Pattern
                .compile("([A-Z])|([a-z])|([0-9])|([!@#$%^&*()\\-+])")
                .matcher(password);
        Set<Integer> hashSet = new HashSet<>();

        while (matchingCases.find()) {
            for (int i = 1; i <= matchingCases.groupCount(); i++) {
                if (matchingCases.group(i) != null) {
                    hashSet.add(i);
                }
            }
        }

        int count = hashSet.size();
        int symbolToAdd = 4 - count;

        if (n + symbolToAdd < 6) {
            return 6 - (n + symbolToAdd) + symbolToAdd;
        }
        else {
            return symbolToAdd;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.nextLine();
        String pwd = sc.nextLine();
        sc.close();
        System.out.println(minimumNumber(n, pwd));
    }
}
