//7. Write a Java program to search for an element in an array list. 

//initializing package
package _02_ArrayList.Question_07;

//imorting arraylist and scanner function 
import java.util.ArrayList;
import java.util.Scanner;

public class search
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
        //getting a number from user to search in list
        System.out.println("Enter a number to search: ");
        int t = scan.nextInt();
        
        //searching an element in list using contains method
        if(num.contains(t))
        {
            System.out.println("The number "+t+" is in index : "+num.indexOf(t));
        } 
        else
        {
            System.out.println("The number "+t+" is not found in list");
        }       
    }  
}