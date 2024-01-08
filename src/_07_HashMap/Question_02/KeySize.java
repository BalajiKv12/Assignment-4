//2. Write a Java program to count the number of key-value (size) mappings in a map. 
package _07_HashMap.Question_02;

//imorting hashmap and scanner function
import java.util.HashMap;
import java.util.Scanner;

public class KeySize
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
        //printing size of key in hashmap using size() method
        System.out.println("Size of Key in hashmap : "+num.size());
    }  
}