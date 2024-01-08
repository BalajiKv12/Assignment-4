//initializing package
package _02_ArrayList;
//importing scanner function
import java.util.Scanner;

//importing all questions in arraylist package
import _02_ArrayList.Question_01.colours;
import _02_ArrayList.Question_02.iterate;
import _02_ArrayList.Question_03.insert;
import _02_ArrayList.Question_07.search;
import _02_ArrayList.Question_08.sort;
import _02_ArrayList.Question_10.shuffle;

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
                insert in = new insert();
                in.compute();
                break;
            //case 7 Question 7
            case 7:
                System.out.println("--------------Question 7------------");
                //creating object and calling the question
                search s = new search();
                s.compute();
                break;
            //case 8 Question 8
            case 8:
                System.out.println("--------------Question 8------------");
                //creating object and calling the question
                sort so = new sort();
                so.compute();
                break;
            //case 10 Question 10
            case 10:
                System.out.println("--------------Question 10-----------");
                //creating object and calling the question
                shuffle sh = new shuffle();
                sh.compute();
                break;        
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}