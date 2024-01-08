//2. Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.

//initializing package
package _10_JavaThread.Question_02;


public class oddEven 
{
    //initializing flag for synchronized threading 
    boolean flag=true;

    //odd method prints odd numbers
    void odd() 
    {
        //initializing synchronized 
        synchronized(this)
        {
            //for loop i=1 increamenting by 2 to print odd numbers
            for(int i=1;i<=20;i=i+2)
            {
                //when the flag is false odd method waits to print
                while(!flag)
                {
                    //catching any exception that occurs
                    try
                    {
                        //using wait() method to hold this thread when flag is false
                        wait();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
                //when the flag is true odd numbers is printed
                System.out.println("Odd = "+i);
                //setting flag to false after printing
                flag=false;
                //notifing other thread after printing is complete
                notify();
            }    
        }
    }
    
    //even method is to print even numbers
    void even()
    {
        //initializing synchronized
        synchronized(this)
        {
            //for loop i=2 increamenting by 2 to print even numbers
            for(int i=2;i<=20;i=i+2)
            {
                //when the flag is true even method waits to print
                while(flag)
                {
                    //catching any exception that occurs
                    try
                    {
                        //using wait() method to hold this thread when flag is true
                        wait();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                }
                //when the flag is false even numbers is printed
                System.out.println("Even = "+i);
                //setting flag to true after printing
                flag=true;
                //notifing other thread after printing is complete
                notify();
            }    
        }
    }
}
