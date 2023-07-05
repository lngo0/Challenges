package com.coding.challenges.hackerrank;

public class TimeConversion {
    /*
    Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

    Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
    - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

    Example
        s = "12:01;00PM"
        Return '12:01:00'.

        s = "12:01:00AM"
        Return '00:01:00'.
    Function Description
        Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.
        timeConversion has the following parameter(s):
        string s: a time in  hour format
    Returns
        string: the time in  hour format
    Input Format
        A single string  that represents a time in -hour clock format (i.e.:  or ).

    Constraints
        All input times are valid
     */
    public static String timeConversion(String s) {
        String str1 = s.substring(0, 2),
                str2 = s.substring(2, 8);
        int hour = Integer.parseInt(str1);
        if (s.contains("P") && hour < 12) {
            hour += 12;
            str1 = String.valueOf(hour);
        } else if (s.contains("A") && hour == 12) {
            str1 = "00";
        }

        return str1 + str2;
    }
}
