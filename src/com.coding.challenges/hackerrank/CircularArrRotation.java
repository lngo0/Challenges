package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CircularArrRotation {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        List<Integer> res = new ArrayList<>();
        k = k % a.size();

        for (Integer q : queries) {
            res.add(a.get((q - k + a.size()) % a.size()));
        }

        return res;
    }
}
