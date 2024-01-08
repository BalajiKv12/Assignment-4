package _01_GeneralQuestions._08_Polymorphism;

/* Polymorphism:
    ->Polymorphism allows to do a single action in multiple forms.
    ->Polymorphism means many forms.
    ->It occurs when we have multiple classes extends or implements from parent class.
    ->It has two types. Compile time polymorphism(method overloading) and runtime polymorphism(method overriding).
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

public class poly 
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
