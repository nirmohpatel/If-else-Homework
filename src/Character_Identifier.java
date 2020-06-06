import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Character_Identifier   // Class
{
    public static void main(String[] args)      // Java main method
    {                                   // Create an object "scanner" inside class + inside main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any value:- ");  // Print statement
        char a = scanner.next().charAt(0);  // defining a variable
        if (a>='0'&& a<='9')    // If - else - if Statement with Logical Operators
        {
            System.out.println("Enter Character is number"); // print statement
        }
        else if (a>= 'a' && a<= 'z'|| a>= 'A' && a<= 'Z')   //If - else - if Statement with Logical Operators
        {
            System.out.println("Enter Character is alphabet");  // print statement
        }
        else
        {
            System.out.println("Enter Character is symbol");    // print statement
        }
    }
}
