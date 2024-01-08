//4. Write a Java program to insert a given element into a priority queue. 

//initializing package
package _06_PriorityQueue.Question_04;

//imorting priority queue and scanner function
import java.util.PriorityQueue;
import java.util.Scanner;

public class insert 
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing Priority queue 
        System.out.println("Enter the size of priority queue : ");
        int n = scan.nextInt();
        PriorityQueue<Integer> num = new PriorityQueue<Integer>(); 

        //getting Integers from user and storing it priority queue
        System.out.println("Enter numbers : ");
        for(int i=0;i<n;i++)
        {
            num.add(scan.nextInt());
        }

        //printing priority queue before inserting
        System.out.println("priority queue before inserting : "+"\n"+num);
        //inserting a number in priority queue
        System.out.println("Enter a number to insert : ");
        num.add(scan.nextInt());
        //printing priority queue after inserting
        System.out.println("priority queue after inserting : "+"\n"+num);
    }
}