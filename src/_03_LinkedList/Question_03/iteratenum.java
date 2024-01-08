//3. Write a Java program to iterate through all elements in a linked list starting at the specified position. 

//initializing package
package _03_LinkedList.Question_03;

//imorting Linked list, scanner function and iterator
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Scanner;

public class iteratenum 
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

        //printing Linkedlist using iterate method from a specified index
        System.out.println("Enter a index number to iterate from : ");
        int k =scan.nextInt();
        System.out.println("Printing Colours by iterating: ");
        ListIterator<String> it = colours.listIterator(k);
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }  
}