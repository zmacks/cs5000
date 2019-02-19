/*
 * Class:       CS 5000/W01 
 * Term:        Spring 2019
 * Name:        Josh Mackey
 * Professor:   Dr. Hisham Haddad
 * Assignment:  1
 * IDE:         jGRASP

 */  
// ======== Program 5 - DrivingCost.java ========
// Calculates total cost of a trip based on distance, fuel efficiency, and fuel price
import java.util.Scanner;
public class DrivingCost
{
 // Take user input for miles, mpg, and price
   public static void main (String[] args)
   {
      double miles, mpg, price,cost;
      Scanner scan = new Scanner (System.in);
      System.out.print ("Enter the number of distance (miles): ");
      miles = scan.nextDouble();
   
      System.out.print ("Enter the fuel efficiency (mpg): ");
      mpg = scan.nextDouble();
   
      System.out.print ("Enter the price per gallon (dollars): ");
      price = scan.nextDouble();
      
      // Calculate cost
      cost = (miles/mpg)*price;
   
      // Prints results
      System.out.println ("The distance (miles): \t\t\t" + miles +
         "\nFuel efficiency (mpg):\t\t\t" + mpg + 
         "\nPrice per gallon (dollars): \t$" + price +
         "\nThe trip cost (dollars):\t\t" + cost); 
   }
}