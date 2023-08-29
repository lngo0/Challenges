package com.coding.challenges.hackerrank;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.Scanner;

public class JavaSHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner sc = new Scanner(System.in);
        byte[] b = sc.nextLine().getBytes();
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        md.reset();
        md.update(b);

        for (byte i : md.digest()) {
            System.out.printf("%02x", i);
        }
        sc.close();
        System.out.println();
    }
}
