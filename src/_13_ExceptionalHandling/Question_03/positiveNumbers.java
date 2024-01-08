//3. Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.

//initializing package
package _13_ExceptionalHandling.Question_03;

//importing io library
import java.io.*;
import java.util.Scanner;

public class positiveNumbers 
{
    public void compute() 
    { 
        try 
        {
            // creating file object f with path of the text file q3
            File f = new File("q3.txt");
            //scanning the file q3
            Scanner scan = new Scanner(f);
            // reading the file
            while (scan.hasNextLine()) 
            {
                try 
                {
                    //reading the string as int
                    int n = Integer.parseInt(scan.nextLine());
                    //finding any positive numbers are there
                    if (n >= 0) 
                    {
                        //throws NumberFormatException() when positive number is founded
                        throw new NumberFormatException();
                    } else 
                    {
                        //prints the negative number
                        System.out.println(n);
                    }
                } 
                catch (NumberFormatException e) 
                {
                    // catches and prints the exception
                    System.out.println("ERROR! Positive number found.");
                }
            }
            //closing the scanner function
            scan.close();
        } 
        catch (IOException e) 
        {
            // catches and prints the exception
            System.out.println("ERROR! File not found");
        }
    }
}