package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    /*

     */
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min_count = 0, max_count = 0,
                min_value = scores.get(0),
                max_value = scores.get(0);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i < scores.size(); i++) {
            int val = scores.get(i);
            if (val > max_value) {
                max_value = val;
                max_count++;
            }
            if (val < min_value) {
                min_value = val;
                min_count++;
            }
        }
        arrayList.add(max_count);
        arrayList.add(min_count);

        return arrayList;
    }
}
