//2. Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

//initializing package
package _10_JavaThread.Question_02;

public class main extends Thread
{
    public static void main(String args[])
    {
        //creating object oe for oddeven class
        oddEven oe = new oddEven();
        //creating thread1 to print odd numbers
        Thread thread1 = new Thread(new Runnable() 
        {  
            public void run() 
            {
                //callind odd method  
                oe.odd();  
            }  
        });  
        //creating thread2 to print even numbers
        Thread thread2 = new Thread(new Runnable() 
        {  
            public void run() 
            {  
                oe.even();  
            }  
        });
        //starting both the threads
        thread1.start();
        thread2.start();
        
    }
}
