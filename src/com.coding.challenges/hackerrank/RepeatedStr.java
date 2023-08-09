package com.coding.challenges.hackerrank;

public class RepeatedStr {
    /*
        There is a string,s , of lowercase English letters that is repeated infinitely many times.
        Given an integer, b, find and print the number of letter a's in the first  letters of the infinite string.

        Example
            s = 'abcac'
            b = 10
        The substring we consider is abcacabcac, the first 10 characters of the infinite string.
        There are 4 occurrences of a in the substring.

        Function Description
            Complete the repeatedString function in the editor below.
            repeatedString has the following parameter(s):
                s: a string to repeat
                n: the number of characters to consider
        Returns
            int: the frequency of a in the substring
        Input Format
            The first line contains a single string, s.
            The second line contains an integer, m.

        Constraints
            1 <= |s| <= 100
            1 <= n <= 10^12
        For 25% of the test cases,n <= 10^5 .

        Sample Input 0
            aba
            10
        Sample Output 0
            7
        Explanation 0
            The first n=10 letters of the infinite string are abaabaabaa. Because there are 7 a's, we return 7.

        Sample Input 1
            a
            1000000000000
        Sample Output 1
            1000000000000
        Explanation 1
        Because all the first n = 1000000000000 letters of the infinite string are a, we return 1000000000000.
     */
    public static int countofA(String s, long rem) {
        int count = 0;
        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
        return count;
    }
    public static long repeatedString(String s, long n) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a')
                count++;
        }
        long rem = n % s.length();
        if (rem == 0)
            return (n / s.length()) * count;
        else {
            long count2 = countofA(s, rem);
            return (n / s.length()) * count + count2;
        }
    }
}
