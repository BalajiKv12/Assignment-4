//initializing package
package _06_PriorityQueue;
//importing scanner function
import java.util.Scanner;

//importing all questions in priority queue package
import _06_PriorityQueue.Question_01.colours;
import _06_PriorityQueue.Question_02.iterate;
import _06_PriorityQueue.Question_03.copy;
import _06_PriorityQueue.Question_04.insert;
import _06_PriorityQueue.Question_05.remove;

public class main {

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
                colours c = new colours();
                c.compute();
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
                copy cp = new copy();
                cp.compute();
                break;
            //case 4 Question 4
            case 4:
                System.out.println("--------------Question 4------------");
                //creating object and calling the question
                insert in = new insert();
                in.compute();
                break;
            //case 5 Question 5
            case 5:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                remove rm = new remove();
                rm.compute();
                break;                
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}
