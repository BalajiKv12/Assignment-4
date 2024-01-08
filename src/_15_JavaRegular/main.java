package _15_JavaRegular;
//importing scanner function
import java.util.Scanner;

import _15_JavaRegular.Question_01.thousand;
import _15_JavaRegular.Question_02.Alpha;
import _15_JavaRegular.Question_03.phone;
import _15_JavaRegular.Question_05.consonants;
import _15_JavaRegular.Question_06.lastVowels;


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
                thousand t= new thousand();
                t.compute();
                break;
            //case 2 Question 2
           case 2:
                System.out.println("--------------Question 2------------");
                //creating object and calling the question
                Alpha a= new Alpha();
                a.compute();
                break;
            //case 3 Question 3
            case 3:
                System.out.println("--------------Question 3------------");
                //creating object and calling the question
                phone p= new phone();
                p.compute();
                break;
            //case 5 Question 5
            case 5:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                consonants c= new consonants();
                c.compute();
                break;
            //case 6 Question 6
            case 6:
                System.out.println("--------------Question 6------------");
                //creating object and calling the question
                lastVowels lv = new lastVowels();
                lv.compute();
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