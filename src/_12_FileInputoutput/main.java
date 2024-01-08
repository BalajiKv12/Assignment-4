package _12_FileInputoutput;
//importing scanner function
import java.util.Scanner;

import _12_FileInputoutput.Question_01.files;
import _12_FileInputoutput.Question_02.extention;
import _12_FileInputoutput.Question_03.path;
import _12_FileInputoutput.Question_04.ReadWrite;
import _12_FileInputoutput.Question_05.pathname;

public class main {

    public static void main(String args[]) throws Exception
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
                files f = new files();
                f.compute();
                break;
            //case 2 Question 2
            case 2:
                System.out.println("--------------Question 2------------");
                //creating object and calling the question
                extention e= new extention();
                e.compute();
                break;
            //case 3 Question 3
            case 3:
                System.out.println("--------------Question 3------------");
                //creating object and calling the question
                path p= new path();
                p.compute();
                break;
            //case 4 Question 4
            case 4:
                System.out.println("--------------Question 4------------");
                //creating object and calling the question
                ReadWrite rw= new ReadWrite();
                rw.compute();
                break;
            //case 5 Question 5
            case 5:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                pathname pn = new pathname();
                pn.compute();
                break; 
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}