//initializing package
package _04_HashSet;
//importing scanner function
import java.util.Scanner;

//importing all question in hashset package
import _04_HashSet.Question_01.append;
import _04_HashSet.Question_02.iterate;
import _04_HashSet.Question_03.size;
import _04_HashSet.Question_04.empty;
import _04_HashSet.Question_05.IsEmpty;

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
                size s = new size();
                s.compute();
                break;
            //case 4 Question 4
            case 4:
                System.out.println("--------------Question 4------------");
                //creating object and calling the question
                empty em = new empty();
                em.compute();
                break;
            //case 5 Question 5
            case 5:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                IsEmpty et = new IsEmpty();
                et.compute();
                break;               
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}