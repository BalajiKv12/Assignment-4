//1. Write a Java program to associate the specified value with the specified key in a HashMap. 
package _07_HashMap.Question_01;

//imorting hashmap and scanner function
import java.util.HashMap;
import java.util.Scanner;

public class key
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing Hashmap 
        System.out.println("Enter number of elements to be entered in hashmap : ");
        int n = scan.nextInt();
        HashMap<Integer,String> num = new HashMap<Integer,String>(); 

        //getting integer values from user and appending it hashmap
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.put(scan.nextInt(), scan.next());
        }
        //printing hashmap after appending
        System.out.println("hashmap : "+"\n"+num);
    }  
}