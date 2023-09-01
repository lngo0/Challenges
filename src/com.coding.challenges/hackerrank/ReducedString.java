package com.coding.challenges.hackerrank;

import java.util.Scanner;

public class ReducedString {
    static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);

         for (int i = 1; i < sb.length(); i++){
            if(sb.charAt(i) == sb.charAt(i - 1)){
                sb.delete(i - 1, i + 1);
                i = 0;
            }
        }

         return sb.toString().isEmpty() ? "Empty String" : sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(superReducedString(s));
    }
}
