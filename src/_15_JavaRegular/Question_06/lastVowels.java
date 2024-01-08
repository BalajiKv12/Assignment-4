//6. Write a Java program to get the last n vowels of a given string.

//initializing package
package _15_JavaRegular.Question_06;
//importing scanner function
import java.util.Scanner;


public class lastVowels
{
    public void compute()
    {
        //initializing scanner function
        Scanner scan = new Scanner(System.in);
        //gettin a string from user
        System.out.println("Enter a String :");
        String s = scan.nextLine();
        //getting a value from user to print last of vowels
        System.out.println("Enter number of vowels to print :");
        int n = scan.nextInt();
        //converting the string to lower case
        s.toLowerCase();

        //replacing all characters apart from vowels
        String vowels = s.replaceAll("[^aeiou]", "");

        //if the value less than vowels present in string it prints the last of vowels
        if(n<=vowels.length())
            System.out.println("String after separating consonants and vowels : "+vowels.substring(vowels.length()-n));
        else
            System.out.println("Invaid number as number greater than vowels present. ");

        //closing scanner function
        scan.close();
    }
}