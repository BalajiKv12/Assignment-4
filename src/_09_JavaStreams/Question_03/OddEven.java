//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

//initializing package
package _09_JavaStreams.Question_03;

//imorting arraylist,scanner functiona and io library
import java.util.ArrayList;
import java.util.Scanner;

public class OddEven
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of list : ");
        int n = scan.nextInt();
        ArrayList<Integer> num = new ArrayList<>(); 

        //getting integer values from user and storing it array list
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.add(i,scan.nextInt());
        }
        //storing sum of even numbers using streams
        int even = num.stream().filter(i->i%2==0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers = "+even);

        //storing sum of odd numbers using streams
        int odd = num.stream().filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of odd numbers = "+odd);
    }
}