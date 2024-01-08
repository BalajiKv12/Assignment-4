//1. Write a Java program to associate the specified value with the specified key in a Tree Map. 

package _08_TreeMap.Question_01;

//imorting treemap and scanner function
import java.util.TreeMap;
import java.util.Scanner;

public class key
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
        //printing Treemap after appending
        System.out.println("Treemap : "+"\n"+num);
    }  
}