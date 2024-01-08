package _01_GeneralQuestions._07_DataHiding;

/* Data Hiding:
    ->Data hiding is used to hide class object members from fro outside class.
    ->It is used to achieve encapusulation.
    ->It is done to prevent unauthorized access and to maintain the integrity of the data.
    ->In Java, data hiding is achieved using access modifiers. 
    ->There are four types of access modifiers: private, public, protected, and default.
    ->The private access modifier is the highest level of data hiding and cannot be accessed from outsite of the class.
*/

class Student 
  {
    // private variables
    private String name;
    private int age;

    // getter method for name
    public String getName()
    {
        return name;
    }

    // setter method for name
    public void setName(String newName) 
    {
        name = newName;
    }

    // getter method for age
    public int getAge() 
    {
        return age;
    }

    // setter method for age
    public void setAge(int newAge) 
    {
        age = newAge;
    }
}

public class dataHide 
{
    public static void main(String[] args) 
    {
        Student student = new Student();

        // setting values through setter methods
        student.setName("Balaji");
        student.setAge(22);

        // getting values through getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
