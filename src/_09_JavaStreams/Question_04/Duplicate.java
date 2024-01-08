//4. Write a Java program to remove all duplicate elements from a list using streams.

//initializing package
package _09_JavaStreams.Question_04;

//imorting arraylist, list, scanner function and collectors.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Duplicate 
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of list : ");
        int n = scan.nextInt();
        ArrayList<String> str = new ArrayList<>(); 
        //list to store strings without duplicate elements
        List<String> str1 = new ArrayList<String>(); 
        //getting string from user and storing it array list
        System.out.println("Enter String : ");
        for(int i=0;i<n;i++)
        {
            String st = scan.next();
            str.add(i,st);
        }
        //removing duplicate strings using streams distinct method and storing it in separate list
        str1=str.stream().distinct().collect(Collectors.toList());
        System.out.println("List without duplicate strings - "+str1);
    }
}