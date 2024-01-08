//3. Write a Java program to validate a phone number.

//initializing package
package _15_JavaRegular.Question_03;
//importing scanner function
import java.util.Scanner;


public class phone 
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //gettin a phone number from user as string
        System.out.println("Enter a phone number in indian format(+91-):");
        String s = scan.nextLine();
        
        //veriying the phone number by using string.matches() method
        if(s.matches("[+91-]{4}[0-9]{10}"))
        {
            System.out.println("It is a valid phone number");
        }
        else
        {
            System.out.println("It is not a valid phone number");
        }

        //closing scanner function
        scan.close();
    }
}