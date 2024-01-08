//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

//initializing package
package _09_JavaStreams.Question_02;

//imorting arraylist, list, scanner function and collectors.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UpperLower 
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of list : ");
        int n = scan.nextInt();
        ArrayList<String> str = new ArrayList<>(); 
        //list to store lowercase or uppercase strings
        List<String> str1 = new ArrayList<String>(); 
        //getting string from user and storing it array list
        System.out.println("Enter String : ");
        for(int i=0;i<n;i++)
        {
            String st = scan.next();
            str.add(i,st);
        }
        //converting list of strings to upper case or lower case using strings
        System.out.println("Press 1 for LowerCase \nPress 2 for UpperCase ");
        int i = scan.nextInt();
        if (i==1) 
        {
            //coverts to lowercase by using mapping and stores it in list str1
           str1= str.stream().map(strin->strin.toLowerCase()).collect(Collectors.toList()) ;   
           System.out.println("LowerCase list - "+str1);        
        }
        else if(i==2)
        {
            //coverts to uppercase by using mapping and stores it in list str1
            str1= str.stream().map(strin->strin.toUpperCase()).collect(Collectors.toList()) ;
            System.out.println("UpperCase list - "+str1);      
        }
        else
        {
            System.out.println("Enter correct number.");
        }
    }
}