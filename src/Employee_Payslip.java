import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Employee_Payslip   // class
{
    public static void main(String[]args) // Java main Method
    {
        Scanner scanner = new Scanner(System.in); // Create an Object " scanner"
        System.out.print(" Please Enter Employ ID:- "); // Print Statement
        int id = scanner.nextInt(); // Local Variable ( Roll number has numeric value + no decimal)
        System.out.print("Please Enter Employ Name:- ");    // Print Statement
        String name = scanner.next();   // Local variable
        System.out.print("Please Enter Basic Salary:- £ "); // Print Statement
        double salary = scanner.nextDouble();   // Local Variable
        double hra = ((salary*10)/100);     // Local Variable
        double da = ((salary*8)/100);       // Local Variable
        double ta = ((salary*9)/100);       // Local Variable
        double pf = ((salary*20)/100);      // Local Variable
        System.out.println('('+"HRA:-" + hra + ", DA:- " + da + ", TA:- " + ta + ", PF:- " + pf +')');  // String Concatenation
        System.out.println("Gross Salary :- " + '£' +(salary+ hra + da + ta - pf));     // String Concatenation
    }
}
