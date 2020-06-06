import java.util.Scanner; // Import scanner. So user can enter Value.

public class Input_Mathematical_Symbols // Class
{
    public static void main(String[] args)  // Java main method
    {
        Scanner scanner = new Scanner(System.in);   // Create an object "scanner" in class
        System.out.print("Enter any two number :- ");   // Print Statement
        int num1 = scanner.nextInt();   // local variable
        System.out.print("Enter second number :- ");    // Print Statement
        int num2 = scanner.nextInt();   // local variable
        System.out.print("Please enter Symbol ( +, - , / , *,) :- ");   // Print Statement
        char symbol = scanner.next().charAt(0); // local variable ( all symbol come under Character)
        if (symbol == '+')  // If - else - if Ladder with Relational Operators
        {                                                                           // String Concatenation
            System.out.println("addition of First and Second number " + num1 + '+' + num2 + " = " + (num1 + num2));
        } else if (symbol == '-') // If - else - if Ladder with Relational Operators
            {                                                                           // String Concatenation
            System.out.println("Subtraction of First and Second number " + num1 + '-' + num2 + '=' + (num1 - num2));
            } else if (symbol == '/')   // If - else - if Ladder with Relational Operators
                {                                                                       // String Concatenation
            System.out.println("Division of First and Second number " + num1 + '/' + num2 + '=' + (num1 / num2));
                } else if (symbol == '*')   // If - else - if Ladder with Relational Operators
                    {                                                                    // String Concatenation
            System.out.println("Multiplication of First and Second number " + num1 + '*' + num2 + '=' + (num1 * num2));
                    }
    }
}
