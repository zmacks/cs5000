/*
 * Class:       CS 5000/W01 
 * Term:        Spring 2019
 * Name:        Josh Mackey
 * Professor:   Dr. Hisham Haddad
 * Assignment:  1
 * IDE:         jGRASP

 */
// ======== Program 1 - HelloWorld.java ========
// Basic program printing message along with user input name
import java.util.Scanner;
public class HelloWorld
{
   public static void main(String args[])
   {
      // Saves user input name
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      // Prints message with name
      String name = s.nextLine();
      System.out.println("Hello " + name + "!");
   }
}