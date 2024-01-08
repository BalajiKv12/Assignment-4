//4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.

//initializing package
package _14_JavaLambda.Question_04;

//imorting arraylist, list, scanner function and Collectors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        //creating array list to store even and odd numbers
        List<Integer> oddList = new ArrayList<>(); 
        List<Integer> evenList = new ArrayList<>(); 

        //getting integer values from user and storing it array list
        System.out.println("Enter numbers: ");
        for(int i=0;i<n;i++)
        {
            num.add(i,scan.nextInt());
        }
        //storing even numbers in list using streams
        evenList = num.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even numbers list : "+evenList);

        //storing odd numbers in list using streams
        oddList = num.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("Odd numbers list : "+oddList);

        //closing scanner function
        scan.close();
    }
}