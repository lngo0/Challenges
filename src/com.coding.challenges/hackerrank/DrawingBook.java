package com.coding.challenges.hackerrank;

public class DrawingBook {
    /*
        A teacher asks the class to open their books to a page number.
        A student can either start turning pages from the front of the book or from the back of the book.
        They always turn pages one at a time. When they open the book, page  is always on the right side:

        When they flip page 1, they see pages 2 and 3. Each page except the last page will always be printed on both sides.
        The last page may only be printed on the front, given the length of the book.
        If the book is n pages long, and a student wants to turn to page p, what is the minimum number of pages to turn?
        They can start at the beginning or the end of the book.
        Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page .

        If the student wants to get to page 3, they open the book to page 1, flip ONE page and they are on the correct page.
        If they open the book to the last page, page 5, they turn ONE page and are at the correct page. Return 1.

        Function Description
            Complete the pageCount function in the editor below.
            pageCount has the following parameter(s):
            int n: the number of pages in the book
            int p: the page number to turn to
        Returns
            int: the minimum number of pages to turn
        Input Format
            The first line contains an integer n, the number of pages in the book.
            The second line contains an integer p, the page to turn to.
     */

    public static int pageCount(int n, int p) {
        return Math.min(p/2, (n/2) - (p/2));
    }
}
