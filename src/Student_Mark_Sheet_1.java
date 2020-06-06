import java.util.Scanner;  // Import scanner. So user can enter Value.

public class Student_Mark_Sheet_1 //class
{
    public static void main(String[]args)// Java main method
    {
        Scanner scanner = new Scanner(System.in);   // Create an Object " scanner"
        System.out.print(" Please Enter Student Name:- "); // Print Statement
        String name =scanner.next(); // local variable
        System.out.print("Student Roll number :- ");    // Print Statement
        int roll_no = scanner.nextInt(); // local variable (Roll number has numeric value + no decimal)
        System.out.print("Please enter your Maths marks:- ");   // Print Statement
        double maths = scanner.nextDouble();    //local variable (Marks has numeric value + with decimal)
        System.out.print("Please enter your English marks:- "); // Print Statement
        double eng = scanner.nextDouble();  //local variable (Marks has numeric value + with decimal)
        System.out.print("Please enter your Science marks:- "); // Print Statement
        double sci = scanner.nextDouble();  //local variable (Marks has numeric value + with decimal)
        double total = maths + eng + sci;   //local variable (add all 3 subject marks)
        double percentage = total / 3;      //local variable (store percentage Value)
        System.out.println("Total marks = " + total);   // String Concatenation
        System.out.println("Total Percentage = " + percentage + '%');   // String Concatenation
        if (percentage < 35)    // If - else if Ladder
        {
            System.out.println(name +" is Fail");   // String Concatenation
        }
        else if (percentage >= 35 && percentage < 50) //Else If statement with Logical Operators
        {
            System.out.println(name+"is Pass with C Grade");
        }
        else if (percentage >= 50 && percentage < 60)
        {
            System.out.println(name + "is Pass with B Grade");
        }
        else if (percentage >= 60 && percentage < 80)
        {
            System.out.println(name +" is Pass with A Grade");
        }
         else if (percentage >= 80)
        {
            System.out.println(name +" is Pass with A+ Grade");
        }
         else
             {
            System.out.println();
             }
    }
}
