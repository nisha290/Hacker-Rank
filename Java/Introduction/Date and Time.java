/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date. You just need to write the method,getDay , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.
Function Description

Complete the findDay function in the editor below.

findDay has the following parameters:

int: month
int: day
int: year
Returns

string: the day of the week in capital letters
Input Format

A single line of input containing the space separated month, day and year, respectively, in    format.

Constraints

Sample Input

08 05 2015
Sample Output

WEDNESDAY
*/

import java.io.*;
import java.util.*;
class Result 
{
    public static int findDay(int m, int d, int y) 
    {
    int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int i=0,r=0,s=0,p=0;
    if(y%400==0 || ((y%4==0) &&(y%100 != 0)) )//To know if year is leap year(century)
        month[1]=29;
    y-=1;     
     r=y%400;    //to get NO. of leap year
     s=r/100;   //to get NO of centurys left after the last leap year
     s=s*5;     // every century adds 5 days
     i=s+d;
     r=r%100;   //to get No of years left 
     s=r/4;     //to know NO of leap year in r 
     s=s*5;     //every 4 years add 5 days
     r=r%4;     //to get NO of years left after last leap year
     i=i+s+r;
     for(int j = 0 ; j < m - 1 ; j++)    //to get NO of days till the given month 
        p = p + month[j] ; 
    i=i+p;
     i=i%7;
     return i;
 }
}

public class Solution  
{
    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
         int mon = sc.nextInt();
         int date = sc.nextInt();
         int year = sc.nextInt();
        String week[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Result x = new Result();
        int y = x.findDay(mon,date,year);
        System.out.println(week[y]) ;
    }
}
