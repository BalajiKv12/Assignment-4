package _16_MiniProjects._02_SchoolManagementSystem;

public class Teacher implements school
{
    //creating teacher name and id in private
    private String name;
    private String id;

    //creating constructor
    public Teacher(String name, String id) 
    {
        this.name = name;
        this.id = id;
    }

    //getName method to get teacher name
    public String getName() 
    {
        return name;
    }
    //setname method is to set teacher name
    public void setName(String name) 
    {
        this.name = name;
    }
    //getId is to get teacher id
    public String getId() 
    {
        return id;
    }
    //displaying teacher details
    public void display() 
    {
        System.out.println("ID: " + id + ", Name: " + name); 
    }

}

