//5. Write a Java program to insert the specified element at the specified position in the linked list. 

//initializing package
package _03_LinkedList.Question_05;

//imorting Linkedlist and scanner function
import java.util.LinkedList;
import java.util.Scanner;

public class insert
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of Linked list : ");
        int n = scan.nextInt();
        LinkedList<Integer> num = new LinkedList<>(); 

        //getting integer values from user and storing it Linked list
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.add(scan.nextInt());
        }
        //printing Linked list before inserting
        System.out.println("Linked List before inserting : "+"\n"+num);
        //getting index from user to insert
        System.out.println("Enter a index to insert : ");
        int i = scan.nextInt();
        //inserting a number in specified position of Linked list
        System.out.println("Enter a number to insert : ");
        num.add(i,scan.nextInt());
        //printing Linked list after inserting
        System.out.println("Linked List after inserting : "+"\n"+num);
    }  
}
