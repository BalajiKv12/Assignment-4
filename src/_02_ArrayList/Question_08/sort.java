//8. Write a Java program to sort a given array list. 

//initializing package
package _02_ArrayList.Question_08;

//imorting arraylist, collections scanner function 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of list : ");
        int n = scan.nextInt();
        ArrayList<Integer> num = new ArrayList<>(); 

        //getting integer from user and storing it array list
        System.out.println("Enter numbers : ");
        for(int i=0;i<n;i++)
        {
            num.add(i,scan.nextInt());
        }
        //printing array list before sorting
        System.out.println("Array List before sorting : "+"\n"+num);
        //sorting list using sort command
        Collections.sort(num);
        //printing list after sorting
        System.out.println("Array List after sorting : "+"\n"+num);
    }
}