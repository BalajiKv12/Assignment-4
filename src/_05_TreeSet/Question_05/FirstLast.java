//5. Write a Java program to get the first and last elements in a tree set. 

//initializing package
package _05_TreeSet.Question_05;

//imorting tree set and scanner function
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;


public class FirstLast
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing treeset 
        System.out.println("Enter number of elements to be entered in tree set : ");
        int n = scan.nextInt();
        TreeSet<Integer> num = new TreeSet<Integer>(); 

        //getting Integers from user and storing it treeset
        System.out.println("Enter numbers : ");
        for(int i=0;i<n;i++)
        {
            num.add(scan.nextInt());
        }

        //printing first and last element of tree set using first() and last() methods
        System.out.println("First Element of tree set num : "+num.first());
        System.out.println("Last Element of tree set num : "+num.last());
    }
}
