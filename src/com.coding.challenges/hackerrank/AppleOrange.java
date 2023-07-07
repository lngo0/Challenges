package com.coding.challenges.hackerrank;

import java.util.List;

public class AppleOrange {
    /*
        In the diagram below:
            The red region denotes the house, where s is the start point, and t is the endpoint.
            The apple tree is to the left of the house, and the orange tree is to its right.
            Assume the trees are located on a single point, where the apple tree is at point a, and the orange tree is at point b.
            When a fruit falls from its tree, it lands d units of distance from its tree of origin along the -axis.
            *A negative value of  means the fruit fell  units to the tree's left,
                and a positive value of  means it falls  units to the tree's right. *
                 @ - for apple and & - for orange
                  |||||                                                 |||||||
                ||||||||||                                             |||||||||
              ||||||||||||||                                        ||||||||||||||
                   |  |                    @           &                  |  |
                   |  |     @           |                |                |  |     &
                    a------>d           s<-------------->t                  b
            Given the value of d for m apples and n oranges, determine how many apples and oranges
                will fall on Sam's house (i.e., in the inclusive range [s,t])?
            For example, Sam's house is between s = 7 and t = 10. The apple tree is located at a = 4 and the orange at b = 12.
                There are m = 3 apples and n = 3 oranges. Apples are thrown apples = [2,3, -4]  units distance from a,
                    and oranges = [3, -2, -4] units distance.
                Adding each apple distance to the position of the tree, they land at [4+2, 4+3, 4 + -4] = [6,7,0].
                    Oranges land at [12+3, 12 + -2, 12 + -4] = [15,10,8].
                    One apple and two oranges land in the inclusive range 7 - 10 so we print
                        1
                        2
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int c_apple = 0,
                c_orange = 0;
        for (Integer apple : apples) {
            int sum = a + apple;
            if (sum >= s && sum <= t)
                c_apple++;
        }
        System.out.println(c_apple);
        for (Integer orange : oranges) {
            int sum = b + orange;
            if (sum >= s && sum <= t)
                c_orange++;
        }
        System.out.println(c_orange);
    }
}
