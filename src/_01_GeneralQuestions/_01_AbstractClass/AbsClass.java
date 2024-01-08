package _01_GeneralQuestions._01_AbstractClass;
/* Abstract Class:
    ->If a class has an abstract method then it an abstract class.
    ->Abstract method is nothing but a method without any implementations or body.
    ->If abstract keyword is used before the class then it is an Abstract Class.
    ->Cannot create Objects for abstract classes.
    ->Abstract class can have both abstract method and normal methods.
    ->A	Sub	class must override an abstract method or else it will become abstract class. */

// Declare an abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();
}

// Subclass (inherit from Animal)
class Cat extends Animal {
    public void sound() {
        // The body of sound() is provided here
        System.out.println("Meow...");
    }
}

class AbsClass {
    public static void main(String[] args) {
        // Create a Cat object
        Cat myCat = new Cat(); 
        myCat.sound();
    }
}
