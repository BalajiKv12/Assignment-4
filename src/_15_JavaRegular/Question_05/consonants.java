//5. Write a Java program to separate consonants and vowels from a given string.

//initializing package
package _15_JavaRegular.Question_05;
//importing scanner function
import java.util.Scanner;


public class consonants
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        ////getting a string from user
        System.out.println("Enter a String :");
        String s = scan.nextLine();
        //converting string to lowercase
        s.toLowerCase();

        //replacing all characters apart from consonants and storing it in another string
        String Consonants = s.replaceAll("[aeiou]", "");
        //replacing all characters apart from vowels and storing it in another string
        String vowels = s.replaceAll("[^aeiou]", "");

        //merginging both consonants and vowels and printing it
        String merge = Consonants+vowels;
        System.out.println("String after separating consonants and vowels : "+merge);

        //closing scanner function
        scan.close();
    }
}
