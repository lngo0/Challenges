package com.coding.challenges.hackerrank;

import java.util.Scanner;

public class JavaCanYouAccess {
    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Inner inner = new Inner();
        Inner.Private p = inner.new Private();
        System.out.println(n + " is " + p.powerof2(n));

        Object o = p;
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }

}
