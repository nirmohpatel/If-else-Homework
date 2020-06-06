import java.util.Scanner;   // Import scanner. So user can enter Value.

public class City_Name      // Class
{
    public static void main(String[]args)   // Java Main Method
    {
        Scanner scanner=new Scanner(System.in); // Create an Object "scanner" in class
        System.out.print("Please Enter Alphabet From a to f:- ");   // Print Statement
        char ch= scanner.next().charAt(0); // Local Variable
        if (ch == 'a')  // If - else - If ladder with Relation Operators
        {
            System.out.println(ch + " = " +"Ahmedabad");    // String Concatenation
        }   else if  (ch == 'b')    // If - else - If ladder with Relation Operators
            {
                System.out.println(ch + " = " +"Bhavnagar");     // String Concatenation
            }   else if  (ch == 'c')    // If - else - If ladder with Relation Operators
                {
                    System.out.println(ch + " = " +"Champaner");     // String Concatenation
                }   else if  (ch == 'd')    // If - else - If ladder with Relation Operators
                        {
                            System.out.println(ch + " = " +"Dwarka");    // String Concatenation
                        }   else if  (ch == 'e')    // If - else - If ladder with Relation Operators
                            {
                                System.out.println(ch + " = " +"Ellora");    // String Concatenation
                            } else if  (ch == 'f')  // If - else - If ladder with Relation Operators
                                {
                                    System.out.println(ch + " = " +"Fort Kochi");    // String Concatenation
                                }

    }
}
