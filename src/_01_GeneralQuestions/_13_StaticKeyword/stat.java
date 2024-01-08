package _01_GeneralQuestions._13_StaticKeyword;

/* Static:
    ->Static Keyword is used for representing meta data.
    ->Static members belongs to a class and they can be shared by all the objects of the class 
      and all the objects have their own non-static members.
    -> Static members can be accessed just by using class name.	
    -> Static methods can access only static members.
    -> Static methods can be overloaded but not overridden.
 */

class Counter
{  
    //initializing a static count variable to count the number of objects.
    static int count=0;  
    Counter()
    {  
        //incrementing and printing the value of static variable
        count++;  
        System.out.println(count);  
    }  
} 
public class stat
{
    public static void main(String args[])
    {  
    //creating objects  
    Counter c1=new Counter();  
    Counter c2=new Counter();  
    Counter c3=new Counter();  
    }  
}
