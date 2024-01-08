package _01_GeneralQuestions._09_MethodOverloading;

/* Method Overloading:
    ->In a class if two or more methods has same name but different parameters is called method overloading.
    ->It is a compile time polymorphism.
    ->It increases the readability of the program.
    ->Method Overloading is not possible by changing the return type.
 */

class Add 
{
    // Overloaded add method with two integer parameters
    static int add(int a, int b) 
    {
        return a + b;
    }

    // Overloaded add method with three integer parameters
    static int add(int a, int b, int c) 
    {
        return a + b + c;
    }
}

public class overload 
{
    public static void main(String[] args) 
    {
        // calls the add method with two parameters
        System.out.println(Add.add(1, 2));  
        // calls the add method with three parameters    
        System.out.println(Add.add(1, 2, 3));  
    }
}
