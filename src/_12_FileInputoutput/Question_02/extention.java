//2. Write a Java program to get specific files with extensions from a specified folder.

//initializing package
package _12_FileInputoutput.Question_02;

//importing io library
import java.io.*;

public class extention  {
    public void compute() throws Exception
    {
        //creating file object f with path of this assignment
        File f = new File("C:/Users/bakv275340/Documents/Java Assignment-4/src/_02_ArrayList");
        //storing the file names in String file
        File file []= f.listFiles();

        //printing the names of the files with .java extentions
        System.out.println("Files are : ");
        for(File i : file)
        {  
            if(i.getName().endsWith(".java")) 
                //prints only .java files
                System.out.println(i.getName());
        }
    }
}