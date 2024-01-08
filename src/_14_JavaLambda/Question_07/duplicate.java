//7. Write a Java program to implement a lambdaexpression to remove duplicates from a list of integers.

//initializing package
package _14_JavaLambda.Question_07;

//imorting arraylist, list and scanner function.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class duplicate 
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of list : ");
        int n = scan.nextInt();
        ArrayList<Integer> num = new ArrayList<>(); 
        //list to store integers without duplicate elements
        List<Integer> num1 = new ArrayList<>(); 
        //getting integers from user and storing it array list
        System.out.println("Enter numbers : ");
        for(int i=0;i<n;i++)
        {
            int st = scan.nextInt();
            num.add(i,st);
        }
        //removing duplicate integers using streams distinct method and storing it in separate list
        num.stream().distinct().forEach(num1::add);
        System.out.println("List without duplicate integers - "+num1);

        //closing scanner function
        scan.close();
    }
}