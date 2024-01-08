//2. Write a Java program to iterate through all elements in a tree set. 

//initializing package
package _05_TreeSet.Question_02;

//imorting tree set and scanner function
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;

public class iterate 
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing tree set
        System.out.println("Enter number of colours to be entered in tree set : ");
        int n = scan.nextInt();
        TreeSet<String> colours = new TreeSet<String>(); 

        //getting string from user and storing it tree set
        System.out.println("Enter Colours : ");
        for(int i=0;i<n;i++)
        {
            String str = scan.next();
            colours.add(str);
        }

        //printing treeset using iterate method 
        System.out.println("Printing numbers by iterating: ");
        for(Iterator it = colours.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
}