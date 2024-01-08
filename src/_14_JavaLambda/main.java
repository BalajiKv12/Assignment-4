package _14_JavaLambda;
//importing scanner function
import java.util.Scanner;

import _14_JavaLambda.Question_01.sum;
import _14_JavaLambda.Question_02.empty;
import _14_JavaLambda.Question_03.UpperLower;
import _14_JavaLambda.Question_04.OddEven;
import _14_JavaLambda.Question_07.duplicate;


public class main {

    public static void main(String args[])
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //getting question number from user
        System.out.println("Enter Question Number : ");
        int n = scan.nextInt();
        //closing scan function
        //calling the questions using switch case
        switch (n) {
            //case 1 Question 1
            case 1:
                System.out.println("--------------Question 1------------");
                //creating object and calling the question
                sum s= new sum();
                s.compute();
                break;
            //case 2 Question 2
           case 2:
                System.out.println("--------------Question 2------------");
                //creating object and calling the question
                empty e= new empty();
                e.compute();
                break;
            //case 3 Question 3
            case 3:
                System.out.println("--------------Question 3------------");
                //creating object and calling the question
                UpperLower ul= new UpperLower();
                ul.compute();
                break;
            //case 4 Question 4
            case 4:
                System.out.println("--------------Question 4------------");
                //creating object and calling the question
                OddEven oe= new OddEven();
                oe.compute();
                break;
            //case 7 Question 7
            case 7:
                System.out.println("--------------Question 7------------");
                //creating object and calling the question
                duplicate d = new duplicate();
                d.compute();
                break; 
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
        //closing the scanner function
        scan.close();
    }   
}