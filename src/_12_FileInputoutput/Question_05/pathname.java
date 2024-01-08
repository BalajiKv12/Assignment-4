//5. Write a Java program to check if the given pathname is a directory or a file

//initializing package
package _12_FileInputoutput.Question_05;

//importing io library
import java.io.*;

public class pathname {
    public void compute() throws Exception
    {
        //creating file object f with path of this assignment
        File f = new File("C:/Users/bakv275340/Documents/Java Assignment-4/src/_02_ArrayList/Question_01");
        
        //printing if the pathname is file or directory
        if(f.isDirectory())
            System.out.println(f.getName()+" is a directory.");
        else
            System.out.println(f.getName()+" is not a directory.");
        
        if(f.isFile())
            System.out.println(f.getName()+" is a file.");
        else
            System.out.println(f.getName()+" is not a file.");  
    }
}