/*
Given an input integer, you must determine which primitive data types are capable of properly storing that input.
Input Format
The first line contains an integer, TT, denoting the number of test cases. 
Each test case, TT, is comprised of a single line with an integer, nn, which can be arbitrarily large or small.
Output Format
For each input variable nn and appropriate primitive dataTypedataType, you must determine if the given primitives are capable of storing it. If yes, then print:
n can be fitted in:
* dataType
If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: byte<short<int<longbyte<short<int<long).
If the number cannot be stored in one of the four aforementioned primitives, print the line:
n can't be fitted anywhere.

*/

import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            
            try
            {
                long a = sc.nextLong();
                System.out.println(a + " can be fitted in:");
                if(a >= -128 && a <= 127 )
                    System.out.println("* byte");
                if(a >= Short.MIN_VALUE  && a <= Short.MAX_VALUE )
                    System.out.println("* short");
                if(a >= Integer.MIN_VALUE  && a <= Integer.MAX_VALUE )
                    System.out.println("* int");
                if(a >=Long.MIN_VALUE  && a <= Long.MAX_VALUE )
                    System.out.println("* long");
            }
             catch(Exception e)
             {
                System.out.println(sc.next() + " can't be fitted anywhere.");
             }
        }
    }
}
