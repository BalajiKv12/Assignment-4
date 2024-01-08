//4. Write a Java program to create a reverse order view of the elements contained in each tree set. 

//initializing package
package _05_TreeSet.Question_04;

//imorting tree set and scanner function
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;


public class reverse
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
        //printing treeset in reverse order using iterate method 
        System.out.println("Printing numbers by in reverse order iterating: ");
        for(Iterator it = num.descendingIterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
}
