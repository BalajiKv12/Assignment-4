package _13_ExceptionalHandling;
//importing scanner function
import java.util.Scanner;

import _13_ExceptionalHandling.Question_01.odd;
import _13_ExceptionalHandling.Question_02.files;
import _13_ExceptionalHandling.Question_03.positiveNumbers;
import _13_ExceptionalHandling.Question_04.empty;
import _13_ExceptionalHandling.Question_06.vowels;

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
                odd o = new odd();
                o.compute();
                break;
            //case 2 Question 2
            case 2:
                System.out.println("--------------Question 2------------");
                //creating object and calling the question
                files f= new files();
                f.compute();
                break;
            //case 3 Question 3
            case 3:
                System.out.println("--------------Question 3------------");
                //creating object and calling the question
                positiveNumbers pn= new positiveNumbers();
                pn.compute();
                break;
            //case 4 Question 4
            case 4:
                System.out.println("--------------Question 4------------");
                //creating object and calling the question
                empty e= new empty();
                e.compute();
                break;
            //case 6 Question 6
            case 6:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                vowels v = new vowels();
                v.compute();
                break; 
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}