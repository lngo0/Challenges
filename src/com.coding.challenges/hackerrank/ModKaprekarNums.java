package com.coding.challenges.hackerrank;

import java.util.ArrayList;

public class ModKaprekarNums {

    public static void kaprekarNumbers(int p, int q) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (long i = p; i <= q; i++) {
            long sq = i * i;
            String num = String.valueOf(i);
            String s = String.valueOf(sq);
            long leftNum = 0,
                    rightNum = 0,
                    sum = 0;
            int leftLength = s.length() - num.length();
            if (leftLength != 0) {
                String leftStr = s.substring(0, leftLength);
                leftNum = Long.parseLong(leftStr);
            }
            String rightStr = s.substring(leftLength);
            rightNum = Long.parseLong(rightStr);
            sum = leftNum + rightNum;
            if (sum == i) {
                arrayList.add(i);
            }
        }
        if (arrayList.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            for (Long a : arrayList) {
                System.out.print(a + " ");
            }
        }
    }
}
