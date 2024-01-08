//4. Write a Java program to check if a file or directory has read and write permissions.

//initializing package
package _12_FileInputoutput.Question_04;

//importing io library
import java.io.*;

public class ReadWrite {
    public void compute() throws Exception
    {
        //creating file object f with path of this assignment
        File f = new File("C:/Users/bakv275340/Documents/Java Assignment-4/src/_02_ArrayList/Question_01/colours.java");
        
        //printing if a file can read or write
        if(f.canRead())
            System.out.println(f.getName()+" The file can read.");
        else
            System.out.println(f.getName()+" The file cannot read.");
        
        if(f.canWrite())
            System.out.println(f.getName()+" The file can write.");
        else
            System.out.println(f.getName()+" The file cannot write.");  
    }
}