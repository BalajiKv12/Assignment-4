//3. Write a Java program to create an array list, add some colors (strings), and print out the collection. 

//initializing package
package _02_ArrayList.Question_03;

//imorting arraylist and scanner function
import java.util.ArrayList;
import java.util.Scanner;

public class insert
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of list : ");
        int n = scan.nextInt();
        ArrayList<Integer> num = new ArrayList<>(); 

        //getting integer values from user and storing it array list
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.add(i,scan.nextInt());
        }
        //printing array list before inserting
        System.out.println("Array List before inserting : "+"\n"+num);
        //inserting a number in first position of array list
        System.out.println("Enter a number to insert : ");
        num.add(0,scan.nextInt());
        //printing array list after inserting
        System.out.println("Array List after inserting : "+"\n"+num);
    }  
}