/*
 * Class:       CS 5000/W01 
 * Term:        Spring 2019
 * Name:        Josh Mackey
 * Professor:   Dr. Hisham Haddad
 * Assignment:  1
 * IDE:         jGRASP

 */
// ======== Program 2 - Pattern.java ========
// Prints the pattern "ABX" as desribed in the Assignment sheet
public class Pattern
{
 // Prints a pattern using tab and new line characters
   public static void main (String[] args)
   {
      System.out.println ("\n" +
         "\t\tA\t\t  BBBB\tX   X\n" +
         "     A A\t\t  B   B\t X X\n" +
         "    AAAAA\t  BBBB\t  X\n" +
         "   A\t\tA\t  B   B\t X X\n" +
         "  A   \t A   BBBB\tX\t X");
   }
}