package com.coding.challenges.hackerrank;

public class JumpingOnCloudsRe {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int i = 0, e = 100;

        for (int j = 0; j < c.length; j++) {
            i = (i + k) % c.length;

            if (c[i] == 1) {
                e -= 3;
            } else {
                e -= 1;
            }

            if (i == 0) {
                break;
            }
        }

        return e;
    }
}
