//3. Write a Java program to get the number of elements in a hash set. 
package _04_HashSet.Question_03;

//imorting hashset and scanner function
import java.util.HashSet;
import java.util.Scanner;

public class size
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
        //printing hashset
        System.out.println("hash set : "+num);
        //finding and printing the size of hashset using size() method
        System.out.println("Size of Hashset: "+num.size());
    }
}