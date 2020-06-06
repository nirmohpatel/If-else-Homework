import java.util.Scanner; // Import scanner. So user can enter Value.

public class Ternary_Operator // class
{       // Java Main Method
        public static void main(String [] args)
        {
            Scanner scanner = new Scanner(System.in); // Create an Object "scanner"
            System.out.print("Please Enter First Number:- "); // print statement for 1 number
            int num1 = scanner.nextInt(); // Local  variable
            String a = ("Even Number");// Statement
            String b = ("Odd Number"); // statement
            String num3 = (num1%2==0)?a:b; // Equation by using Ternary Operator
            System.out.println(num3);// print out put base on input number
            System.out.print("Please Enter Second Number:- ");// print Statement for 2 number
            int num2 = scanner.nextInt();// Local variable
            String num4 = (num2%2==0)?a:b;// Equation by using Ternary Operator
            System.out.println(num4);// print out put base on input number


        }
}
