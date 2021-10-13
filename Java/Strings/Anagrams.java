/*
Two strings, a and ,b are called anagrams if they contain all the same characters in the same frequencies. 
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a: the first string
string b: the second string
Sample Input 0
anagram
margana
Sample Output 0
Anagrams

Sample Input 1
anagramm
marganaa
Sample Output 1
Not Anagrams
*/

import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] x = a.toCharArray();
        Arrays.sort(x);
        char[] y = b.toCharArray();
        Arrays.sort(y);
        String A = new String(x);
        String B = new String(y);
        if(A.equals(B))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
