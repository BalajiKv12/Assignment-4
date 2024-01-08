//2. Write a Java program to iterate through all elements in a linked list. 

//initializing package
package _03_LinkedList.Question_02;

//imorting Linked list, scanner function and iterator
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class iterate 
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing Linked list 
        System.out.println("Enter the size of Linked list : ");
        int n = scan.nextInt();
        LinkedList<String> colours = new LinkedList<>(); 

        //getting string from user and storing it Linked list
        System.out.println("Enter Colours : ");
        for(int i=0;i<n;i++)
        {
            String str = scan.next();
            colours.add(str);
        }

        //printing Linkedlist using iterate method 
        System.out.println("Printing Colours by iterating: ");
        for(Iterator it = colours.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }  
}