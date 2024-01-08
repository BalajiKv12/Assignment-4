//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list. 

//initializing package
package _03_LinkedList.Question_10;

//imorting Linkedlist and scanner function
import java.util.LinkedList;
import java.util.Scanner;

public class occurance
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
        //getting a number from user finding first and last occurance
        System.out.println("Enter a number to find first and last occurance : ");
        int i = scan.nextInt();
        // prints -1 if the number not found
        System.out.println("First Occurance : "+"\n"+num.indexOf(i)); 
        System.out.println("Last Occurance : "+"\n"+num.lastIndexOf(i));
    }  
}
