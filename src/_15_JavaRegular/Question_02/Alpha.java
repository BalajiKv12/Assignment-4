//2. Write a Java program to remove all non-alphanumeric characters from a given string.

//initializing package
package _15_JavaRegular.Question_02;
//importing scanner function
import java.util.Scanner;


public class Alpha 
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        ////getting a string from user
        System.out.println("Enter a String :");
        String s = scan.nextLine();
        //replacing all non alpha-numeric characters using regex \W function 
        // \W - Neither Alphabets or digits
        System.out.println("String after replacing all non alpha-numeric characters : "+s.replaceAll("\\W", ""));
        //closing scanner function
        scan.close();
    }
}
