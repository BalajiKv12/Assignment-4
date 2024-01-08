package _01_GeneralQuestions._06_Abstraction;

/* Abstraction:
    ->Abstraction hides the complexity of the system and shows only the functionality to the user.
    ->It lets you focus on what the object does instead of how it does it.
    ->It can be achieved with either abstract classes or interfaces.
    ->Abstract class can have both abstract method and normal methods.
    ->Interfaces can only have abstract methods.
 */

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherit from Animal)
class Dog extends Animal 
{
    public void animalSound() 
    {
        // The body of animalSound() is provided here
        System.out.println("dog barks...");
    }
}

public class Abstract 
{
    public static void main(String[] args) 
    {
        // Create a Dog object
        Dog dog = new Dog(); 
        dog.animalSound();
        dog.sleep();
    }
}
