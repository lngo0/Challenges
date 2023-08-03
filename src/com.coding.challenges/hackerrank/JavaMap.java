package com.coding.challenges.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int pNum = sc.nextInt();
            sc.nextLine();
            map.put(name, pNum);
        }

        while (sc.hasNext()) {
            String lookUp = sc.nextLine();
            try {
                int num = map.get(lookUp);
                System.out.println(lookUp + "=" + num);
            } catch (Exception e) {
                System.out.println("Not found");
            }
        }
    }
}
