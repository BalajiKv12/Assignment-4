//initializing package
package _10_JavaThread.Question_01;

//extending thread class to hello
public class hello extends Thread
{
    //printing the message using run() method
    public void run()
    {
        System.out.println("Hello, World!");
    }
}
