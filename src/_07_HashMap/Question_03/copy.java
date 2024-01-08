//3. Write a Java program to copy all mappings from the specified map to another map. 
package _07_HashMap.Question_03;

//imorting hashmap and scanner function
import java.util.HashMap;
import java.util.Scanner;

public class copy
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
        //copying all mappings from num to num1
        HashMap<Integer,String> num1 = new HashMap<Integer,String>(); 
        num1.putAll(num1);
        //printing hashmap num and num1
        System.out.println("Hashmap num : "+num);
        System.out.println("Hashmap num1 : "+num);
    }  
}