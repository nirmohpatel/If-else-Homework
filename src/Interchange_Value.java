import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Interchange_Value  //Class
{
    public static void main(String[] args)  // Java Main Method
    {
        Scanner scanner = new Scanner(System.in); // Create an Object "scanner"
        System.out.print("Enter first value :- "); //Print Statement
        int a = scanner.nextInt();  // Local variable
        System.out.print("Enter second value :- "); //Print Statement
        int b = scanner.nextInt();  // Local variable
        int temp = a;   // Local variable ( Store a Value in temp)
        a=b;    // Local variable ( Store b Value in a)
        b=temp; // Local variable ( Store temp Value in b)
        System.out.println("First Value :- " + a);  //String Concatenation
        System.out.println("Second Value :- " +b);  //String Concatenation
    }
}
