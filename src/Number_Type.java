import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Number_Type    // Class
{
    public static void main(String[]args)   // Java main Method
    {
        Scanner scanner = new Scanner(System.in);   // Create an Object " scanner"
        System.out.print("Please Enter Any Number:- "); // Print Statement
        int number = scanner.nextInt();     // Local Variable
        if (number>0)       // If - else - if ladder with Relational Operators
            {
            System.out.println("Enter Number is Positive Value"); // Print Statement
            } else if (number==0)   // If - else - if ladder with Relational Operators
                {
                System.out.println("Enter Number is Zero Value");   // Print Statement
                } else  // If - else - if ladder
                    {
                    System.out.println("Enter Number is Negative Value");   // Print Statement
                    }
    }

}
