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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        sc.nextLine();
        String pwd = sc.nextLine();
        sc.close();
        System.out.println(minimumNumber(n, pwd));
    }
}
