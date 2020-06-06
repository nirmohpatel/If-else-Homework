import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Print_Alphabet     // Class
{
    public static void main(String[] args)      // Java Main Method
    {
        Scanner scanner = new Scanner(System.in);   // create an object "scanner" in class
        System.out.print("Please Enter Uppercase Alphabet:- "); // Print statement
        char ch= scanner.next().charAt(0);  // local variable
        int a = (int)ch;    // local variable ( Character value to numeric value)
        a = (a + 32);       //local variable ( add 32 in character numeric value)
        char b=(char)a;     //local variable ( numeric value to character value)
        System.out.print(ch + "="); // String Concatenation
        System.out.println(b);  // print statement
    }
}
