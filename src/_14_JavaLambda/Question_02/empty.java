//2. Write a Java program to implement a lambda expression to check if a given string is empty.

//initializing package
package _14_JavaLambda.Question_02;

//importing scanner function
import java.util.Scanner;

//creating an interface string
interface string
{
    void EmptyString(String s);
}

public class empty
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //getting a string from user
        System.out.println("Enter a string :");
        String a = scan.nextLine();
        //checking a string is empty or not using lamba function
        //true - empty, false - not empty
        string se = (s) -> System.out.println("String is empty or not : "+s.isEmpty());
        //calling EmptyString method
        se.EmptyString(a);
        //closing scanner function
        scan.close();
    }   
}

