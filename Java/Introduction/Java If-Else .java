/*
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
Given an integer NN as input, check the following:
If NN is odd, print "Weird".
If NN is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
If NN is even and, in between the range of 6 and 20(inclusive), print "Weird".
If NN is even and N>20N>20, print "Not Weird".
We given you partially completed code in the editor, complete it to solve the problem.
Input Format
There is a single line of input: integer NN.
Constraints
1≤N≤1001≤N≤100
Output Format
Print "Weird" if the number is weird. Otherwise, print "Not Weird". Do not print the quotation marks.
Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
*/

import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2 == 0)
        {
            if(a >= 2 && a <= 5)
                System.out.println("Not Weird");
            else if(a >= 6 && a <= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
            
        }
        else
            System.out.println("Weird");
    }
}
