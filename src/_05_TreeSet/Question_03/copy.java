//3. Write a Java program to add all the elements of a specified tree set to another tree set.

//initializing package
package _05_TreeSet.Question_03;

//imorting treeset and scanner function
import java.util.TreeSet;
import java.util.Scanner;

public class copy 
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing treeset 
        System.out.println("Enter number of elements to be entered in tree set : ");
        int n = scan.nextInt();
        TreeSet<Integer> num = new TreeSet<Integer>(); 

        //getting Integers from user and storing it treeset
        System.out.println("Enter numbers : ");
        for(int i=0;i<n;i++)
        {
            num.add(scan.nextInt());
        }

        //copying one tree set from another by using addall
        TreeSet<Integer> num1 = new TreeSet<Integer>();
        num1.addAll(num);
        //printing Treeset num
        System.out.println("Numbers in num : "+num);
        //printing treeset num1
        System.out.println("Numbers in num1 : "+num1);
    }
}
