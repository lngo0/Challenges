package com.coding.challenges.hackerrank;

import java.util.Scanner;

public class CamelCase {
    static int camelcase(String s) {
        return s.split("[A-Z]").length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(camelcase(s));
    }
}
