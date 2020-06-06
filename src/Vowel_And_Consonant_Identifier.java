import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Vowel_And_Consonant_Identifier     // Class
{
    public static void main(String[]args)   // Java Main Method
    {                                   // Create an object "scanner" inside class + inside main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Single character from Alphabet:- "); // print Statement
        char ch= scanner.next().charAt(0);  // Defining a ch variable
        if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')  // If - else  Statement with Logical Operators
            {
            System.out.println("Input Letter is Vowel");    // print Statement
            }   else
                {
                System.out.println("Input Letter is Consonant");    // print Statement
                }
    }
}
