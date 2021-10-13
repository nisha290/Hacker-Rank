/*
You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth BB and height HH. You should read the variables from the standard input.
If B≤0B≤0 or HH ≤0≤0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
Input Format
There are two lines of input. The first line contains BB: the breadth of the parallelogram. The next line contains HH: the height of the parallelogram.
Constraints 
−100≤B≤100−100≤B≤100 
−100≤H≤100−100≤H≤100
Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
Sample input 1
1
3
Sample output 1
3
*/

import java.io.*;
import java.util.*;
public class Solution 
{
    public static int a;
    public static int b;
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();
        if(a < 1 || b <1)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
            System.out.println(a*b);
    
    }
}
