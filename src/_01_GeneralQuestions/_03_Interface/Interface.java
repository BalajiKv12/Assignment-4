package _01_GeneralQuestions._03_Interface;
/* Interface:
    ->An interface can only have abstract class and not concrete class.
    ->All the methods are by default abstract.
    ->In interface child class implements from parant class and must override all abstract methods.
    ->In Interface we can have reference of interface and the object of the class which is implemented.
    ->It is used to achieve multiple inheritance. */

// Declare an interface
interface Animal {
    // Abstract method (does not have a body)
    abstract void sound();
}

// Subclass implements from Animal
class Cat implements Animal 
{
    public void sound() 
    {
        // The body of sound() is provided here
        System.out.println("Meow...");
    }
}

class Interface {
    public static void main(String[] args) {
        // Create a Cat object
        Cat myCat = new Cat(); 
        myCat.sound();
    }
}
