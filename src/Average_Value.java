import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Average_Value  // Class
{
    public static void main(String [] args)     // Java Main method
    {
        Scanner scanner = new Scanner (System.in);  // Create an object "scanner"
        System.out.println("Please Enter Any five Number :- "); // Print Statement
        int a = scanner.nextInt();  // Local Variable
        int b = scanner.nextInt();  // Local Variable
        int c = scanner.nextInt();  // Local Variable
        int d = scanner.nextInt();  // Local Variable
        int e = scanner.nextInt();  // Local Variable                       // String Concatenation
        System.out.println( '('+ "you have Enter:-"+"A:-"+ a +", B:-"+ b + ", C:-"+ c + ", D:-"+ d +", E:-"+ e +')');
        int f = ((a+b+c+d+e)/5);    // Local Variable with Average formula
        System.out.println("Average of Five Number:-"+f);       // String Concatenation

    }
}
