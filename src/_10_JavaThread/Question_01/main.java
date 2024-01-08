//1. Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.

//initializing package
package _10_JavaThread.Question_01;

public class main {

    public static void main(String args[])
    {
        //initializing object for hello class and thread class
        hello h = new hello();
        Thread t = new Thread(h);
        //starting the thread using start() method
        t.start();
    }
    
}
