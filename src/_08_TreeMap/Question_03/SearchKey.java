//3. Write a Java program to search for a key in a Tree Map. 

package _08_TreeMap.Question_03;

//imorting treemap and scanner function
import java.util.TreeMap;
import java.util.Scanner;

public class SearchKey
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
        //Search a key in treemap using containskey() method
        System.out.println("Enter an key to search in treemap : ");
        int k = scan.nextInt();
        if(num.containsKey(k))
            //prints if key is present
            System.out.println("The key is present in tree map");
        else
            //prints if key is not present
            System.out.println("The key is not there in tree map");
    }
}