/*
We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string,s , and an integer, n, complete the function so that it finds the lexicographically smallest and largest substrings of length n.

Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
*/
import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        String small = "";
        String large = "";
        small = large = s.substring(0, k);
        for (int i=1; i<s.length()-k+1; i++) 
        {
            String sub = s.substring(i, i+k);
            if (small.compareTo(sub) > 0)
                small = sub;
            if (large.compareTo(sub) < 0)
                large = sub;
         }
        System.out.println(small + "\n" + large);
    }
}
