//4. Write a Java program to remove all duplicate elements from a list using streams.

//initializing package
package _09_JavaStreams.Question_05;

//imorting arraylist and scanner function
import java.util.ArrayList;
import java.util.Scanner;

public class count
{ 
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);

        //initializing array list 
        System.out.println("Enter the size of list : ");
        int n = scan.nextInt();
        ArrayList<String> str = new ArrayList<>(); 
        //getting string from user and storing it array list
        System.out.println("Enter String : ");
        for(int i=0;i<n;i++)
        {
            String st = scan.next();
            str.add(i,st);
        }
        System.out.println("Enter first character of a string in the list to count : ");
        char s = scan.next().charAt(0);

        //counting the strings which starts with the letter which user entered using streams
        long c = str.stream().filter(i->i.startsWith(String.valueOf(s))).count();
        System.out.println("Number of strings starts with letter "+ s+" : "+c);
    }
}

