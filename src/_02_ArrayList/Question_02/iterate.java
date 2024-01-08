//2. Write a Java program to iterate through all elements in an array list. 

//initializing package
package _02_ArrayList.Question_02;

//imorting arraylist, scanner function and iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class iterate 
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

        //printing array list using iterate method 
        System.out.println("Colours : ");
        for(Iterator it = colours.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }  
}