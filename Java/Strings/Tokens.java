/*
Given a string,s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.
Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he
*/

import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.trim();
        if(s.isEmpty())
            System.out.println(0);
        else
        {
            String[] a = s.split("'+( +|)| +|!+( +|)|,+( +|)|_+( +|)|@+( +|)|\\.+( +|)|\\?+( +|)|\\\\+( +|)");
            System.out.println(a.length);
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);
        }
    }   
}
