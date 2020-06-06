import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Name_Of_7_Days // Class
{
    public static void main(String[]args)   // Java Main Method
    {                                   // Create an Object " scanner" inside class + inside Main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Number From 1 to 7:- "); // Print out statement
        char ch= scanner.next().charAt(0);  // Defining an "ch" character Variable
        if (ch == '1')  // If - else - if Statement with Relational Operators
            {
            System.out.println("Day" + ch + " = " +"Monday");   // Print out statement
            }   else if  (ch == '2')    // If - else - if Statement with Relational Operators
                {
                    System.out.println("Day" + ch + " = " +"Tuesday");  // Print out statement
                }   else if  (ch == '3')    // If - else - if Statement with Relational Operators
                    {
                        System.out.println("Day" +ch + " = " +"Wednesday"); // Print out statement
                    }   else if  (ch == '4')    // If - else - if Statement with Relational Operators
                        {
                            System.out.println("Day" + ch + " = " +"Thursday"); // Print out statement
                        }   else if  (ch == '5') // If - else - if Statement with Relational Operators
                            {
                                System.out.println("Day" + ch + " = " +"Friday");   // Print out statement
                            } else if  (ch == '6')  // If - else - if Statement with Relational Operators
                                {
                                    System.out.println("Day" + ch + " = " +"Saturday"); // Print out statement
                                }   else if  (ch == '7')    // If - else - if Statement with Relational Operators
                                        {                                   // Print out statement
                                            System.out.println("Day" + ch + " = " +"Sunday");
                                        }
    }
}