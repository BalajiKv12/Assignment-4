//4. Write a Java program to search for a value in a Tree Map. 

package _08_TreeMap.Question_04;

//imorting treemap and scanner function
import java.util.TreeMap;
import java.util.Scanner;

public class SearchValue
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
        System.out.println("Enter an value to search in treemap : ");
        String k = scan.next();
        if(num.containsValue(k))
            //prints if value is present
            System.out.println("The value is present in tree map");
        else
            //prints if value is not present
            System.out.println("The value is not there in tree map");
    }
}