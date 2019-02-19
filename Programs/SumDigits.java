/*
 * Class:       CS 5000/W01 
 * Term:        Spring 2019
 * Name:        Josh Mackey
 * Professor:   Dr. Hisham Haddad
 * Assignment:  1
 * IDE:         jGRASP

 */ 
// ======== Program 3 - SumDigits.java ========
// Takes user input number and creates a sum based on each digit in number

import java.util.Scanner;
public class SumDigits
{
 // Asks for 4-digit number, does calculation, then prints result
   public static void main (String[] args)
   {
      Scanner s = new Scanner (System.in);
      System.out.println ("Please enter 4-digit number: ");
      int digits, sum;
      digits = s.nextInt();
      sum = digits; 
      // struggling to do this without converting to string
      // (char)digits 
      System.out.println ("The input number is: " + digits);
      System.out.println ("The sum of digits is: " + sum);
   }
}