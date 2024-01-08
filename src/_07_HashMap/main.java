package _07_HashMap;
//importing scanner function
import java.util.Scanner;

//importing all questions in hashmap package
import _07_HashMap.Question_01.key;
import _07_HashMap.Question_02.KeySize;
import _07_HashMap.Question_03.copy;
import _07_HashMap.Question_04.remove;
import _07_HashMap.Question_05.CheckKey;

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
                key k = new key();
                k.compute();
                break;
            //case 2 Question 2
            case 2:
                System.out.println("--------------Question 2------------");
                //creating object and calling the question
                KeySize ks = new KeySize();
                ks.compute();
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
                remove rm = new remove();
                rm.compute();
                break;
            //case 5 Question 5
            case 5:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                CheckKey ck = new CheckKey();
                ck.compute();
                break;       
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}
