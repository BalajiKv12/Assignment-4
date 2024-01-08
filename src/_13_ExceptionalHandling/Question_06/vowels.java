//6. Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.

//initializing package
package _13_ExceptionalHandling.Question_06;

//importing scanner function
import java.util.Scanner;

public class vowels 
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //getting a String from user
        System.out.println("Enter a string : ");
        String n = scan.nextLine();
        //converting the string to lowercase 
        n.toLowerCase();
        //declaring count variable c
        int c=0;
        for(int i=0;i<n.length();i++)
        {
            //finding if any of the characters of string has vowels and counts it
            if(n.charAt(i)=='a' ||n.charAt(i)=='e' ||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u')
            {
                c++;
            }
        }
        try
        {
            if(c==0)
            {
                //throws an exception when the string does not have vowels
                throw new IllegalArgumentException();
            }
            else
            {
                //prints if the string has vowels
                System.out.println("The String contains vowels.");
            }
                
        }
        catch(IllegalArgumentException e)
        {
            //prints the exception
            System.out.println("Error! String does have vowels.");
        }
    }
}