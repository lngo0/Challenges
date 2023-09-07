package com.coding.challenges.hackerrank;

import java.util.Scanner;

public class StringTokens {
    /*
    Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
    We define a token to be one or more consecutive English alphabetic letters.
    Then, print the number of tokens, followed by each token on a new line.

    Note: You may find the String.split method helpful in completing this challenge.

    Input Format

        A single string,s .

    Constraints
        1 <= length of s <= 4 * 10^5
        s is composed of the following: English alphabetic letters, blank spaces, exclamation points (!),
            commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
    Output Format
        On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique).
        Next, print each of the  tokens on a new line in the same order as they appear in input string .
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }

        scan.close();

    }
}
