package com.coding.challenges.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    /*
        Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume.
        Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

        For example, assume the bill has the following prices: bill = [2,4,6]. Anna declines to eat item k = bill[2] which costs 6.
        If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3.
        If he includes the cost of bill[2], he will calculate (2+4+6)/2 = 6. In the second case, he should refund 3 to Anna.

        Function Description
            Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split.
            Otherwise, it should print the integer amount of money that Brian owes Anna.
           bonAppetit has the following parameter(s):
                bill: an array of integers representing the cost of each item ordered
                k: an integer representing the zero-based index of the item Anna doesn't eat
                b: the amount of money that Anna contributed to the bill
        Input Format
            The first line contains two space-separated integers  and , the number of items ordered and the -based index of the item that Anna did not eat.
            The second line contains  space-separated integers  where .
            The third line contains an integer, , the amount of money that Brian charged Anna for her share of the bill.

        The amount of money due Anna will always be an integer
        Output Format
            If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e., b.charged - b.actual) that Brian must refund to Anna.
            This will always be an integer.
     */
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        ArrayList<Integer> list = (ArrayList<Integer>) bill;
        list.remove(k);
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        int price = sum / 2;
        if (price == b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - price);

    }
}
