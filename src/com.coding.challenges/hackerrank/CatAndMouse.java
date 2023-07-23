package com.coding.challenges.hackerrank;

public class CatAndMouse {
    /*
        Two cats and a mouse are at various positions on a line. You will be given their starting positions.
        Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed.
        If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

        You are given  queries in the form of x, y, and z representing the respective positions for cats A and B, and for mouse C.
        Complete the function  to return the appropriate answer to each query, which will be printed on a new line.
            If cat  catches the mouse first, print Cat A.
            If cat  catches the mouse first, print Cat B.
            If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.
        Example
            x = 2
            y = 5
            z = 4
            The cats are at positions 2 (Cat A) and  5(Cat B), and the mouse is at position 5.
            Cat B, at position 5 will arrive first since it is only 1 unit away while the other is 2 units away.
            Return 'Cat B'.

        Function Description
            Complete the catAndMouse function in the editor below.
            catAndMouse has the following parameter(s):
            int x: Cat 's position
            int y: Cat 's position
            int z: Mouse 's position
        Returns
            string: Either 'Cat A', 'Cat B', or 'Mouse C'
        Sample Input 0
            2
            1 2 3
            1 3 2
        Sample Output 0
            Cat B
            Mouse C
     */

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);
        if (catA == catB) {
            return "Mouse C";
        }
        else if (catA > catB) {
            return "Cat B";
        } else {
            return "Cat A";
        }
    }
}
