//5. Write a Java program to test if a hash set is empty or not. 
package _04_HashSet.Question_05;

//imorting hashset and scanner function
import java.util.HashSet;
import java.util.Scanner;

public class IsEmpty
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
        //checking whether hashset is empty or not. True - empty, False - not empty
        System.out.println("Hashset is empty or not : "+num.isEmpty());
    }
}