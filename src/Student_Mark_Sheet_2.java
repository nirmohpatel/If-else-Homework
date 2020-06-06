import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Student_Mark_Sheet_2   // Class
{
    public static void main(String[]args) // Java main method
    {
        Scanner scanner = new Scanner(System.in);   // Create an object "scanner" in class
        System.out.print(" Please Enter Student Name:- ");  // Print Statement
        String name =scanner.next();    // Local Variable   (Marks has numeric value + with decimal)
        System.out.print("Student Roll number :- ");    // Print Statement
        int roll_no = scanner.nextInt();    //Local Variable (Marks has numeric value + with decimal)
        System.out.print("Please enter your Maths marks:- ");   // Print Statement
        double maths = scanner.nextDouble();  // Local Variable (Marks has numeric value + with decimal)
        System.out.print("Please enter your English marks:- "); // Print Statement
        double eng = scanner.nextDouble();    // Local Variable (Marks has numeric value + with decimal)
        System.out.print("Please enter your Science marks:- "); // Print Statement
        double sci = scanner.nextDouble();  // Local Variable (Marks has numeric value + with decimal)
        double total = maths + eng + sci;   // Local Variable (Add all 3 subject marks)
        double percentage = total / 3;  // Local Variable ( Store percentage Value)
        System.out.println("Total marks = " + total);   // String Concatenation
        System.out.println("Total Percentage = " + percentage + '%');   // String Concatenation
        if (maths> 35 && eng >35 && sci > 35)   // Nested if Statement with Logical Operators
        {
            if (percentage >= 35 && percentage < 50)    //If statement with Logical Operators
            {
                System.out.println(name +"is Pass with C Grade");   //String Concatenation
            }
            else if (percentage >= 50 && percentage < 60)
            {
                System.out.println(name +"is Pass With B Grade");
            }
            else if (percentage >= 60 && percentage < 80)
            {
                System.out.println(name +" is Pass with A Grade");
            }
            else if (percentage >= 80)
            {
                System.out.println(name +" is Pass with A+ Grade");
            }
        }          else
                        {
                        System.out.println(name +" is Fail");
                        }
    }

}