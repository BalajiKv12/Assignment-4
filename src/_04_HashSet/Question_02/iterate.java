//2. Write a Java program to iterate through all elements in a hash list. 
package _04_HashSet.Question_02;

//imorting hashset and scanner function
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class iterate
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing HashSet 
        System.out.println("Enter number of elements to be entered in hashset : ");
        int n = scan.nextInt();
        HashSet<Integer> num = new HashSet<Integer>(); 

        //getting integer values from user and storing it hashset
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.add(scan.nextInt());
        }
        //printing hashset using iterate method 
        System.out.println("Printing numbers by iterating: ");
        for(Iterator it = num.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
}