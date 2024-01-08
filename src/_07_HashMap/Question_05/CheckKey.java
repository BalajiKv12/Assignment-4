//5. Write a Java program to check whether a map contains key-value mappings (empty) or not. 
package _07_HashMap.Question_05;

//imorting hashmap and scanner function
import java.util.HashMap;
import java.util.Scanner;

public class CheckKey
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

        //checking and printing whether hashmap is empty or not by using isEmpty() method 
        //true - empty , false - not empty
        System.out.println("whether hashmap is empty : "+num.isEmpty());
    }  
}
