//1. Write a Java program to append the specified element to the end of a hash set. 
package _04_HashSet.Question_01;

//imorting hashset and scanner function
import java.util.HashSet;
import java.util.Scanner;

public class append
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing HashSet 
        System.out.println("Enter number of elements to be entered in hashset : ");
        int n = scan.nextInt();
        HashSet<Integer> num = new HashSet<Integer>(); 

        //getting integer values from user and appending it hashset
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.add(scan.nextInt());
        }
        //printing hashset after appending
        System.out.println("hashset after appending : "+"\n"+num);
    }  
}