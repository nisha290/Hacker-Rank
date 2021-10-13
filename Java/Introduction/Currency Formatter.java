/*
Given a double-precision number,pay, denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert pay into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where formattedpay is pay formatted according to the appropriate Locale's currency.
Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
*/

import java.io.*;
import java.util.*;
import java.text.NumberFormat;
public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        
        Locale indiaLocale = new Locale("en", "in");

        /* Create NumberFormats using Locales */
        NumberFormat us    = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
      
        System.out.println("US: "     + us.format(a));
        System.out.println("India: "  + india.format(a));
        System.out.println("China: "  + china.format(a));
        System.out.println("France: " + france.format(a));
    }
}
