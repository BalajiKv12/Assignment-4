package _01_GeneralQuestions._02_SingletonClass;

public class main {
    public static void main(String[] args) 
    {  
        //creating multiple objects
        SingleClass singleton1 = SingleClass.getobject();  
        SingleClass singleton2 = SingleClass.getobject();  
        if (singleton1 == singleton2) 
        {  
            //both are same objects
            System.out.println("Both objects are the same instance.");  
        }  
    }  
    
}
