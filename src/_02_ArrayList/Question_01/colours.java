//1. Write a Java program to create an array list, add some colors (strings), and print out the collection. 
//initializing package
package _02_ArrayList.Question_01;

//imorting arraylist and scanner function
import java.util.ArrayList;
import java.util.Scanner;

public class colours 
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of list : ");
        int n = scan.nextInt();
        ArrayList<String> colours = new ArrayList<>(); 

        //getting string from user and storing it array list
        System.out.println("Enter Colours : ");
        for(int i=0;i<n;i++)
        {
            String str = scan.next();
            colours.add(i,str);
        }

        //printing array list
        System.out.println("Colours : "+"\n"+colours);
    }
}