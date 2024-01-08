package _01_GeneralQuestions._04_Encapsulation;

/* Encapsulation:
    ->It is a process of wrapping the data and hides it from user.
    ->It is achieved by declaring the variables of a class as private and providing public setter and getter methods.
    ->It provides control over the data by hiding it from direct access. 
    ->Only the methods of the class can access and modify this data.
    ->It allows the code to be flexible and easy to change. */
    
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

public class encap 
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
