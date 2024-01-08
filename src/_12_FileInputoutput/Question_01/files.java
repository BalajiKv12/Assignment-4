//1. Write a Java program to get a list of all file/directory names in the given directory.

//initializing package
package _12_FileInputoutput.Question_01;

//importing io library
import java.io.*;

public class files {
    public void compute()
    {
        //creating file object f with path of this assignment
        File f = new File("C:/Users/bakv275340/Documents/Java Assignment-4/src");
        //storing the file names in String file
        String file []= f.list();

        //printing the names of the files using for-each loop
        System.out.println("Files are : ");
        for(String i : file)
        {   
            System.out.println(i);
        }
    }
    
}
