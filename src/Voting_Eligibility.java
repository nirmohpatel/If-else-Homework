import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Voting_Eligibility // Class
{
    public static void main(String[] args)  // Java Main Method
    {
        Scanner scanner = new Scanner(System.in); // Create an object "scanner" in class
        System.out.print("Please enter your age:- ");   // Print statement
        int age = scanner.nextInt();    //Local variable

        if (age >= 18)  // If - else Statement
        {
            System.out.println("Person is eligible to vote");   // Print Statement
        }
        else
        {
            System.out.println("Person is not eligible to vote");    // Print Statement
        }
    }
}
