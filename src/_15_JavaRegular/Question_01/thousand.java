//1. Write a Java program that takes a number and sets a thousand separators for that number

//initializing package
package _15_JavaRegular.Question_01;
//importing scanner function
import java.util.Scanner;

public class thousand 
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //gettin a value from user 
        System.out.println("Enter a number :");
        int s = scan.nextInt();
        
        //thousand separating the number using %,d format specifier 
        System.out.printf( "Number with thousand separators : %,d\n", s );
        //closing scanner function
        scan.close();
    }
}
