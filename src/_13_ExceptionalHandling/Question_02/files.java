//2. Write a Java program to create a method that reads a file and throws an exception if the file is not found.

//initializing package
package _13_ExceptionalHandling.Question_02;

//importing io library
import java.io.*;
import java.util.Scanner;
public class files {
    public void compute()
    {
        try
        {
        //creating file object f with path of this assignment
        File f = new File("C:/Users/bakv275340/Documents/Java Assignment-4/src/_02_ArrayList/Question_01/colours.java");
        //checking whether it is a file 
        if(f.isFile())
        {
            //scanning the file 
            Scanner scan = new Scanner("C:/Users/bakv275340/Documents/Java Assignment-4/src/_02_ArrayList/Question_01/colours.java");
            //reading the file
            while(scan.hasNextLine())
            {
                String line = scan.nextLine();
                System.out.println(line);
            }
            //closing the scanner function
            scan.close();
        }
        else
        {
            //if the file not found it throws FileNotFound exception
            throw new FileNotFoundException();
        }
        }
        //catches the exception
        catch(FileNotFoundException e)
        {
            //prints the exception
            System.out.println("ERROR! File not found");
        } 
    }
}