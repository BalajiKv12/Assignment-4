package _01_GeneralQuestions._11_Super;

/* Super:
    ->It is a reference keyword which is used to refer immediate parent class object.
    ->It can be used to refer immediate parent class variable and invoke immediate parent class method and constructor.
    ->It cannot be used in a static method or variable.
    ->It is added in each class constructor automatically by compiler if the user not initialized.
 */

// Parent class
class Animal 
{
    String color = "white";
}

// Child class
class Dog extends Animal 
{
    String color = "black";

    void printColor() 
    {
        // prints color of Dog class
        System.out.println(color);  
        // prints color of Animal class
        System.out.println(super.color);  
    }
}

public class supers 
{
    public static void main(String[] args) 
    {
        //creating dog object
        Dog dog = new Dog();
        dog.printColor();
    }
}
