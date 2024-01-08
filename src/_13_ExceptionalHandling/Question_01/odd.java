//initializing package
package _13_ExceptionalHandling.Question_01;

//importing scanner function
import java.util.Scanner;

public class odd 
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //getting a value from user
        System.out.println("Enter an number : ");
        int n = scan.nextInt();
        try
        {
            if(n%2!=0)
                //throws an exception when the number is odd
                throw new IllegalArgumentException("Error you have entered an Odd number.");
        }
        catch(IllegalArgumentException e)
        {
            //prints the exception
            System.out.println("Error you have entered an Odd number.");
        }
    }
}
