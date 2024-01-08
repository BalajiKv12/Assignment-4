package _09_JavaStreams;
//importing scanner function
import java.util.Scanner;

import _09_JavaStreams.Question_01.average;
import _09_JavaStreams.Question_02.UpperLower;
import _09_JavaStreams.Question_03.OddEven;
import _09_JavaStreams.Question_04.Duplicate;
import _09_JavaStreams.Question_05.count;

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
                average a = new average();
                a.compute();
                break;
            //case 2 Question 2
            case 2:
                System.out.println("--------------Question 2------------");
                //creating object and calling the question
                UpperLower ul = new UpperLower();
                ul.compute();
                break;
            //case 3 Question 3
            case 3:
                System.out.println("--------------Question 3------------");
                //creating object and calling the question
                OddEven od= new OddEven();
                od.compute();
                break;
            //case 4 Question 4
            case 4:
                System.out.println("--------------Question 4------------");
                //creating object and calling the question
                Duplicate d= new Duplicate();
                d.compute();
                break;
            //case 5 Question 5
            case 5:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                count c= new count();
                c.compute();
                break; 
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}