package _01_GeneralQuestions._02_SingletonClass;

/* SingletonClass:
    ->A Singleton class allows only one object to be created.
    ->It is achieved by making the constructor private.
    ->It provides a global point of access to that object.
    ->Declare a static method that returns a single object of a class. */

public class SingleClass 
{
    //Declaring a private static variable to hold the single object of the class.
    private static final SingleClass single = new SingleClass();  
    private SingleClass()
    {
        //declaring a private constructor
    }  
    public static SingleClass getobject() 
    {  
        //returns a single object 
        return single;  
    }  
}  


  
    
 