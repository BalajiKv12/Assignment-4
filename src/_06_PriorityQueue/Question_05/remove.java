//5. Write a Java program to remove all elements from a priority queue. 

//initializing package
package _06_PriorityQueue.Question_05;

//imorting priority queue and scanner function
import java.util.PriorityQueue;
import java.util.Scanner;

public class remove 
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

        //printing priority queue before removing all elements
        System.out.println("priority queue before removing all elements : "+"\n"+num);
        //removing all elements in priority queue
        num.removeAll(num);
        //printing priority queue after removing all elements
        System.out.println("priority queue after removing all elements : "+"\n"+num);
    }
}