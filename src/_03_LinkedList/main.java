//initializing package
package _03_LinkedList;

//importing scanner function
import java.util.Scanner;

//importing all questions in linked list package
import _03_LinkedList.Question_01.append;
import _03_LinkedList.Question_02.iterate;
import _03_LinkedList.Question_03.iteratenum;
import _03_LinkedList.Question_05.insert;
import _03_LinkedList.Question_10.occurance;

public class main 
{

    public static void main(String args[])
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //getting question number from user
        System.out.println("Enter Question Number : ");
        int n = scan.nextInt();
        //calling the questions using switch case
        switch (n) {
            //case 1 Question 1
            case 1:
                System.out.println("--------------Question 1------------");
                //creating object and calling the question
                append a = new append();
                a.compute();
                break;
            //case 2 Question 2
            case 2:
                System.out.println("--------------Question 2------------");
                //creating object and calling the question
                iterate i = new iterate();
                i.compute();
                break;
            //case 3 Question 3
            case 3:
                System.out.println("--------------Question 3------------");
                //creating object and calling the question
                iteratenum in = new iteratenum();
                in.compute();
                break;
            //case 5 Question 5
            case 5:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                insert it = new insert();
                it.compute();
                break;
            //case 10 Question 10
            case 10:
                System.out.println("--------------Question 10-----------");
                //creating object and calling the question
                occurance oc = new occurance();
                oc.compute();
                break;          
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}