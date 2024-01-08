//4. Write a Java program to remove all mappings from a map. 
package _07_HashMap.Question_04;

//imorting hashmap and scanner function
import java.util.HashMap;
import java.util.Scanner;

public class remove
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

        //printing hashmap num before removing
        System.out.println("Hashmap num before removing: "+num);
        //removing hashmap elements using clear() method
        num.clear();
        //printing hashmap num after removing
        System.out.println("Hashmap num after removing : "+num);
    }  
}