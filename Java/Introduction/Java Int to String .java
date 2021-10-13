/*
You are given an integer nn, you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully converts nn into a string ss the code will print "Good job". Otherwise it will print "Wrong answer".
nn can range between −100−100 to 100100 inclusive.
*/

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       String s = Integer.toString(a);
       if(a == Integer.parseInt(s))
            System.out.println("Good job");
        else
        System.out.println("Wrong answer");
    }
}
