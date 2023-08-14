package com.coding.challenges;

public class EquationGen {
    /*
        Build equation generator where inputs are between 1 and 100.
        Print out sum of number divisible by 3 or by 5
        For example: from 1 to 10, result will be "3+5+6+9=23"
     */
    public static String calCum(int a, int b) {
        int sum = 0;
        StringBuilder result = new StringBuilder();
        if (a < 1 || b < 1 || b > 100) {
            return "Incorrect";
        } else {
            for (int i = a; i < b; i++) {
                if (i%3 == 0 || i%5 == 0) {
                    if (result.isEmpty()) {
                        result.append(i);
                    } else {
                        result.append("+").append(i);
                    }
                    sum += i;
                }
            }
        }
        result.append("=").append(sum);
        return result.toString();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //3+5+6+9=23
        System.out.println(calCum(1, 10));
        //3+5+6+9+10=33
        System.out.println(calCum(1, 12));
    }
}
