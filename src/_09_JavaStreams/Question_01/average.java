//1. Write a Java program to calculate the average of a list of integers using streams. 

//initializing package
package _09_JavaStreams.Question_01;

//imorting arraylist,scanner functiona and io library
import java.util.ArrayList;
import java.util.Scanner;

public class average
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
        // Calculate the average using streams maping
        double average = num.stream().mapToDouble(Integer::intValue).average().orElse(0.0);
        System.out.println("average by using Stream : " + average);      
    }
}