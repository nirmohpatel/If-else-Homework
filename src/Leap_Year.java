import java.util.Scanner; // Import scanner. So user can enter Value.

public class Leap_Year // class
{
    // Java Main Method
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in); // Create an Object "scanner"
        System.out.print("Please Enter Any Year (like 1989):- "); // print statement
        int year = scanner.nextInt(); // local variable
        if (year%4==0) // Equation with Relation Operators
            {
                System.out.print("Enter year " + year +" is Leap Year"); // String Concatenation
            } else
                {
                    System.out.print("Enter year "+year+" is Common Year"); // String Concatenation
                }
    }

}
