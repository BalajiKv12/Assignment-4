//4. Write a Java program that reads a file and throws an exception if the file is empty.

//initializing package
package _13_ExceptionalHandling.Question_04;

//importing io library
import java.io.*;
import java.util.Scanner;

public class empty 
{
    public void compute() 
    { 
        try 
        {
            // creating file object f with path of the text file q4
            File f = new File("q4.txt");
            //scanning the file q4
            Scanner scan = new Scanner(f);
            // reading the file
            if (scan.hasNextLine()) 
            {
                //if the file is not empty it prints the content in the file
                System.out.println(scan.nextLine());
                System.out.println("File is not empty");
            } 
            else
            {
                //if the file is empty it throws FileNotFoundException()
                throw new FileNotFoundException();
            }
        }
        catch (FileNotFoundException e) 
        {
            // catches and prints the exception
            System.out.println("ERROR! File not found");
        }
    }
}