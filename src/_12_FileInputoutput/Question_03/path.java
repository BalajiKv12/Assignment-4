//3. Write a Java program to check if a file or directory specified by pathname exists or not.

//initializing package
package _12_FileInputoutput.Question_03;

//importing io library
import java.io.*;

public class path {
    public void compute() throws Exception
    {
        //creating file object f with path of this assignment
        File f = new File("C:/Users/bakv275340/Documents/Java Assignment-4/src/_02_ArrayList");
        
        //printing if a file or directory specified by pathname exists or not 
        //true - exists, false - not exists
        System.out.println("If a file or directory specified by pathname exists or not : "+f.exists());
        
    }
}