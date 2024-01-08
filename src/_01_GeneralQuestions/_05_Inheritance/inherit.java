package _01_GeneralQuestions._05_Inheritance;

/* Inheritance:
    ->Inheritance is the process of acquiring features of an existing Class into a New Class.
    ->It helps in reusing the code, makes the code more readable.
    ->Inheritance is declared using extends keyword.
    ->It can be referred to Parent-Child relationship.
    ->Child class or sub class will have all the methods and properties of Parent or Super class.
*/

// Superclass
class Animal 
{
    public void eat() 
    {
        System.out.println("Eat.....");
    }
}

// Subclass
class Dog extends Animal 
{
    public void bark() {
        System.out.println("Bark.....");
    }
}

public class inherit 
{
    public static void main(String[] args) 
    {
        //creating object for subclass dog
        Dog dog = new Dog();
        dog.eat(); // method from superclass
        dog.bark(); // method from subclass
    }
}
