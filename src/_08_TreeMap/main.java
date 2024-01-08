package _08_TreeMap;
//importing scanner function
import java.util.Scanner;

//importing all questions in treemap package
import _08_TreeMap.Question_01.key;
import _08_TreeMap.Question_02.copy;
import _08_TreeMap.Question_03.SearchKey;
import _08_TreeMap.Question_04.SearchValue;
import _08_TreeMap.Question_05.KeyPrint;

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
                copy cp = new copy();
                cp.compute();
                break;
            //case 3 Question 3
            case 3:
                System.out.println("--------------Question 3------------");
                //creating object and calling the question
                SearchKey sk= new SearchKey();
                sk.compute();
                break;
            //case 4 Question 4
            case 4:
                System.out.println("--------------Question 4------------");
                //creating object and calling the question
                SearchValue sv= new SearchValue();
                sv.compute();
                break;
            //case 5 Question 5
            case 5:
                System.out.println("--------------Question 5------------");
                //creating object and calling the question
                KeyPrint kp = new KeyPrint();
                kp.compute();
                break;  
            default:
                //printing if there is no related question number
                System.out.println("Invaild Question");
                break;
        } 
    }   
}