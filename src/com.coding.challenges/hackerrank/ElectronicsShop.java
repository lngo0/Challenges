package com.coding.challenges.hackerrank;

public class ElectronicsShop {
    /*
    A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget.
    Given price lists for keyboards and USB drives and a budget, find the cost to buy them.
    If it is not possible to buy both items, return -1.

    Example
        b = 60
        keyboards = [40,50,60]
        drives = [5,8,12]
    The person can buy a 40 keyboard + 12 USB drive = 52, or a 50 keyboard + 8 USB drive = 58.
    Choose the latter as the more expensive option and return 58.

    Function Description
        Complete the getMoneySpent function in the editor below.
        getMoneySpent has the following parameter(s):
            int keyboards[n]: the keyboard prices
            int drives[m]: the drive prices
            int b: the budget
    Returns
        int: the maximum that can be spent, or  if it is not possible to buy both items
    Input Format
        The first line contains three space-separated integers , , and , the budget, the number of keyboard models and the number of USB drive models.
        The second line contains  space-separated integers , the prices of each keyboard model.
        The third line contains  space-separated integers , the prices of the USB drives
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int result = 0;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum > result && sum <= b)
                    result = sum;
            }
        }

        return result > 0 ? result : -1;
    }
}
