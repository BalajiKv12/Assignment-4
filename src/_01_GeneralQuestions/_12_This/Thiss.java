package _01_GeneralQuestions._12_This;

/* this:
    ->this keyword refers to the current object in a method or constructor.
    ->It is to eliminate the confusion between class attributes and parameters with the same name.
    ->It is used to invoke current class constructor and method.
    ->It is used to return the current class object.
 */

class Student 
{
    // private variables
    private int rollno;
    private String name;

    //declaring constructors
    Student(int rollno, String name) 
    {
        //usage of this keyword
        this.rollno = rollno;
        this.name = name;
    }

    void display() 
    {
        //displaying the contents
        System.out.println(rollno + " " + name);
    }
}

public class Thiss 
{
    public static void main(String[] args) 
    {
        //creating student object
        Student s1 = new Student(106, "Balaji");
        s1.display();
    }
}
