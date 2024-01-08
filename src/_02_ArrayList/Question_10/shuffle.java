//10. Write a Java program to shuffle elements in an array list. 

//initializing package
package _02_ArrayList.Question_10;

//imorting arraylist, collections scanner function 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class shuffle
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
        //printing array list before shuffling
        System.out.println("Array List before shuffling : "+"\n"+num);
        //shuffling list using shuffle command
        Collections.shuffle(num);
        //printing list after shuffling
        System.out.println("Array List after shuffling : "+"\n"+num);
    }
}