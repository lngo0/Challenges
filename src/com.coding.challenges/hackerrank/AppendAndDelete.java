package com.coding.challenges.hackerrank;

public class AppendAndDelete {
    public static String appendAndDelete(String s, String t, int k) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                tIndex++;
            } else {
                break;
            }
        }

        int minOps = 0;
        minOps = (s.length() - sIndex) + (t.length() - tIndex);
        if (k < minOps)
            return "No";
        if (k >= s.length() + t.length())
            return "Yes";
        if ((k - minOps) % 2 == 0)
            return "Yes";

        return "No";
    }
}
