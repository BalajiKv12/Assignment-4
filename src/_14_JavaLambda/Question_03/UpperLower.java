//3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase. 
//initializing package
package _14_JavaLambda.Question_03;

//imorting arraylist and scanner function
import java.util.ArrayList;
import java.util.Scanner;

public class UpperLower
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
        System.out.println("Enter Strings : ");
        for(int i=0;i<n;i++)
        {
            String st = scan.next();
            str.add(i,st);
        }
        //converting the list of string to lowercase uisng lambda function
        str.replaceAll(st->st.toLowerCase());
        //printing the list of strings
        System.out.println("LowerCase - "+str);

        //converting the list of string to uppercase uisng lambda function
        str.replaceAll(st->st.toUpperCase());
        //printing the list of strings
        System.out.println("UpperCase - "+str);
        //closing scanner function
        scan.close();
    }
}