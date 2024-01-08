//1. Write a Java program to implement a lambda expression to find the sum of two integers.

//initializing package
package _14_JavaLambda.Question_01;

//importing scanner function
import java.util.Scanner;

//creating an interface add
interface add
{
    void sum(int x, int y);
}

public class sum 
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //getting two integer values from user
        System.out.println("Enter two numbers :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        //adding two integers using lamba function
        add addi = (x,y) -> System.out.println("Sum = "+(x+y));
        //calling sum method
        addi.sum(a, b);
        //closing scanner function
        scan.close();
    }   
}
