/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Sample Input

madam
Sample Output

Yes
*/

import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = "";
        for(int i = s.length()-1; i>=0 ; i--)
        {
            r = r+s.charAt(i);
        }
        if(r.compareTo(s) == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
