package com.coding.challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CheckerboardColors {
    /*
    Checkerboard Colors
    Programming challenge description:
    Given a square's location on a checkerboard, write a program to determine the color of the square.

    Each square can be one of two colors: Black or White. The square in the bottom left is always Black and the size of the checkerboard is 8x8.

    For any given square, all its adjacent squares have a different color. In other words, any two squares have different colors if they share an edge between them.

    Columns are designated by characters a, b, c, d, e, f, g, h from left to right. Rows are designated by numbers 1, 2, 3, 4, 5, 6, 7, 8 from bottom to top. The address of a single square is a concatenation of the character and integer values.

    See the attachments tab for an image of the checkerboard.

    Input:
    A string with the alpha-numeric address of the square. For example:

    f7
    Output:
    Print the color of the square: Black or White.

    Print Error if the address is invalid.

    Test 1
    Test Input
    Download Test 1 Input
    f7
    Expected Output
    Download Test 1 Output
    White
    Test 2
    Test Input
    Download Test 2 Input
    a1
    Expected Output
    Download Test 2 Output
    Black
    Test 3
    Test Input
    Download Test 3 Input
    bh9
    Expected Output
    Download Test 3 Output
    Error
    Test 4
    Test Input
    Download Test 4 Input
    d5
    Expected Output
    Download Test 4 Output
    White
     */
    private static final String WHITE = "White";

    private static final String BLACK = "Black";
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line, color = "";
        ArrayList<Character> oddCol = new ArrayList<>();
        oddCol.add('a');
        oddCol.add('c');
        oddCol.add('e');
        oddCol.add('g');
        while ((line = in.readLine()) != null) {
            if (line.length() != 2) {
                System.out.println("Error");
            } else {
                int rowNum = Integer.parseInt(String.valueOf(line.charAt(1)));
                if (rowNum % 2 != 0 && oddCol.contains(line.charAt(0))) {
                    color = BLACK;
                } else if (rowNum % 2 != 0 && !oddCol.contains(line.charAt(0))) {
                    color = WHITE;
                } else if ( rowNum % 2 == 0 && oddCol.contains(line.charAt(0))) {
                    color = WHITE;
                } else {
                    color = BLACK;
                }
            }
            System.out.println(color);
        }
    }
}
