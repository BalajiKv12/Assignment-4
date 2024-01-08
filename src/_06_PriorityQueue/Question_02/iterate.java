//2. Write a Java program to iterate through all elements in the priority queue.

//initializing package
package _06_PriorityQueue.Question_02;

//imorting priority queue, iterator and scanner function
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Scanner;

public class iterate
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing Priority queue 
        System.out.println("Enter the size of priority queue : ");
        int n = scan.nextInt();
        PriorityQueue<String> colours = new PriorityQueue(); 

        //getting string from user and storing it priority queue
        System.out.println("Enter Colours : ");
        for(int i=0;i<n;i++)
        {
            String str = scan.next();
            colours.add(str);
        }

        //printing priority queue using iterate method 
        System.out.println("Colours : ");
        for(Iterator it = colours.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
}