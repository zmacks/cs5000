/*
 * Class:       CS 5000/W01 
 * Term:        Spring 2019
 * Name:        Josh Mackey
 * Professor:   Dr. Hisham Haddad
 * Assignment:  1
 * IDE:         jGRASP

 */
// ======== Program 4 - Distance.java ========
// Calculates the distance between two user input points and prints results
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Distance
{
 // Takes user input for xy coordinates
   public static void main (String[] args)
   {
      Scanner s = new Scanner (System.in);
   
      double x1, y1, x2, y2, distance;
   
      System.out.println ("x1 value is: ");
      x1 = s.nextInt();
      System.out.println ("y1 value is: ");
      y1 = s.nextInt();
      System.out.println ("x2 value is: ");
      x2 = s.nextInt();
      System.out.println ("y2 value is: ");
      y2 = s.nextInt();
   
   // Calculates distance between two points
      distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
   
   // Prints results
      System.out.println ("First point coordinates: \t(" + x1 +
         ", " + y1 + ")\nSecond point coordinates:\t(" + x2 + ", " +
         y2 + ")");
      System.out.println ("The distance is: \t\t\t\t" + distance);
   }
}