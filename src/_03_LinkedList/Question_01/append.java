//1. Write a Java program to append the specified element to the end of a linked list.
package _03_LinkedList.Question_01;

//imorting linkedlist and scanner function
import java.util.LinkedList;
import java.util.Scanner;

public class append
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing Linked list 
        System.out.println("Enter the size of linked list : ");
        int n = scan.nextInt();
        LinkedList<Integer> num = new LinkedList<>(); 

        //getting integer values from user and storing it linked list
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.add(scan.nextInt());
        }
        //printing linked list before appending
        System.out.println("Linked List before appending : "+"\n"+num);
        //appending a number in last position of linked list
        System.out.println("Enter a number to append : ");
        num.addLast(scan.nextInt());
        //printing linked list after appending
        System.out.println("Linked List after appending : "+"\n"+num);
    }  
}
