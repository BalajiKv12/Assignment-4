//1. Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue. 

//initializing package
package _06_PriorityQueue.Question_01;

//imorting Priority queue and scanner function
import java.util.PriorityQueue;
import java.util.Scanner;

public class colours 
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

        //printing priority queue
        System.out.println("Colours : "+"\n"+colours);
    }
}