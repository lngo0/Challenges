package com.coding.challenges.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DesignerPDFViewer {
    /*
        When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle.
        In this PDF viewer, each word is highlighted independently. For example:

        There is a list of  character heights aligned by index to their letters. For example, 'a' is at index  and 'z' is at index . There will also be a string. Using the letter heights given, determine the area of the rectangle highlight in  assuming all letters are  wide.

        Example
            h = [1,3,1,3,1,4,1,3,2,5,5,5,1,1,5,5,1,5,2,5,5,5,5,5] word =' torn'

        The heights are t= 2, o = 1, r = 1  and n = 1 . The tallest letter is 2 high and there are 4 letters.
        The hightlighted area will be 2*4 = 8 mm^2 so the answer is 8.

        Function Description
            Complete the designerPdfViewer function in the editor below.
            designerPdfViewer has the following parameter(s):
            int h[26]: the heights of each letter
            string word: a string
        Returns
            int: the size of the highlighted area
        Input Format
            The first line contains  space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z].
            The second line contains a single word consisting of lowercase English alphabetic letters.

        Constraints
            1 <= h[?] <= 7, where ? is an English lowercase letter.
             contains no more than 10 letters.

        Sample Input 0
            1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
            abc
        Sample Output 0
            9
        Explanation 0
            We are highlighting the word abc:
            Letter heights are a = 1, b = 3 and c = 1. The tallest letter, b, is 3mm high.
            The selection area for this word is 3 * 1mm * 3mm = 9 mm^2.
            Note: Recall that the width of each character is .
        Sample Input 1
            1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
            zaba
        Sample Output 1
            28
        Explanation 1
            The tallest letter in zaba is z at 7mm.
            The selection area for this word is 4 * 1mm * 7mm = 28 mm^2.
     */
    public static int designerPdfViewer(List<Integer> h, String word) {
        int max = 0;
        for (int i = 0; i < word.length(); i++) {   //word = a b c = 3
            int ascii = (int) word.charAt(i);       // 97
            int val = ascii - 97;                   // 0
            if (h.get(val) > max) {
                max = h.get(val);
            }
        }
        return word.length() * max;
    }

}
