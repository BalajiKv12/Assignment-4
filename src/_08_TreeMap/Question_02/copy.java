//2. Write a Java program to copy Tree Map's content to another Tree Map. 

package _08_TreeMap.Question_02;

//imorting treemap and scanner function
import java.util.TreeMap;
import java.util.Scanner;

public class copy
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing Hashmap 
        System.out.println("Enter number of elements to be entered in Treemap : ");
        int n = scan.nextInt();
        TreeMap<Integer,String> num = new TreeMap<Integer,String>(); 

        //getting integer values from user and appending it Treemap
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.put(scan.nextInt(), scan.next());
        }
        //copying all mappings from num to num1
        TreeMap<Integer,String> num1 = new TreeMap<Integer,String>(); 
        num1.putAll(num1);
        //printing TreeMap num and num1
        System.out.println("TreeMap num : "+num);
        System.out.println("TreeMap num1 : "+num);
    }  
}