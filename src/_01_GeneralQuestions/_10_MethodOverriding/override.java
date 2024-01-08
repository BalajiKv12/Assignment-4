package _01_GeneralQuestions._10_MethodOverriding;

/* Method Overriding:
    ->Method overriding happens when child class uses the same method from parent class and overrides it.
    ->Method overriding is used for runtime polymorphism.
    ->The method must have the same name and parameter as in the parent class.
    ->Static methods cannot be overidden.
*/

// Parent class
class Animal 
{
    void sound() 
    {
        System.out.println("The animal makes a sound");
    }
}

// Child class
class Dog extends Animal 
{
    //child class overrides the parent class
    void sound() 
    {
        System.out.println("The dog barks...");
    }
}

public class override 
{
    public static void main(String[] args) 
    {
        // Create an Animal object
        Animal myAnimal = new Animal();  
        // Create a Dog object
        Animal myDog = new Dog();  

        //calling the methods
        myAnimal.sound();
        myDog.sound();
    }
}
