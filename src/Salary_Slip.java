import java.util.Scanner;   // Import scanner. So user can enter Value.

public class Salary_Slip    // Class
{
    public static void main(String []args)     // Java Main Method
    {
        Scanner scanner = new Scanner(System.in);   // Create an Object " scanner" in class
        System.out.print("Please Enter Sales ID:- ");   // Print Statement
        int seller_id= scanner.nextInt();   // Local variable
        System.out.print("Please Enter Seller's Name:- ");  // Print Statement
        String name= scanner.next();    // Local variable for string
        System.out.print("Please Enter Sales amount:- £");  // Print Statement
        double sales_amount= scanner.nextDouble();  // Local variable (sales amount has numeric value + with decimal)
        System.out.print("Please Enter Basic Salary Amount:- £");   // Print Statement
        double basic_salary=scanner.nextDouble();   // Local variable (basic Salary has numeric value + with decimal)
        if (sales_amount>=50000)    // If - else - if Ladder with Relational Operators
            {
                System.out.print(name+" Sales Commission :- £" + (sales_amount*0.35));  //String Concatenation
            } else if (sales_amount>=30000) // If - else - if Ladder with Relational Operators
                {
                    System.out.print(name+" Sales Commission :- £" + (sales_amount*0.20));  //String Concatenation
                } else if (sales_amount>=20000) // If - else - if Ladder with Relational Operators
                    {
                        System.out.print(name+" Sales Commission :- £" + (sales_amount*0.10));  //String Concatenation
                    } else if (sales_amount>=10000) // If - else - if Ladder with Relational Operators
                        {
                            System.out.print(name+" Sales Commission :- £" + (sales_amount*0.05));
                        }  else                                         //String Concatenation
                            {
                                System.out.print(name+" Sales Commission :- £" + (sales_amount*0.02));
                            }                                           //String Concatenation

    }
}
