//3. Write a Java program to add all the elements of a priority queue to another priority queue. 

//initializing package
package _06_PriorityQueue.Question_03;

//imorting priority queue and scanner function
import java.util.PriorityQueue;
import java.util.Scanner;

public class copy 
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

        //copying one priority queue from another by using addall
        PriorityQueue<Integer> num1 = new PriorityQueue<Integer>();
        num1.addAll(num);
        //printing priority queue num
        System.out.println("Numbers in num : "+"\n"+num);
        //printing priority queue num1
        System.out.println("Numbers in num1 : "+"\n"+num1);
    }
}
