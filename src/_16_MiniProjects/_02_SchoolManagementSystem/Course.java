package _16_MiniProjects._02_SchoolManagementSystem;
//importing Arraylist and list
import java.util.ArrayList;
import java.util.List;

public class Course implements school
{
    //declaring course name,id, teachers and Studentlist in private
    private String name;
    private String id;
    private Teacher teacher;
    private List<students> cStudent;

    //creating constructor
    public Course(String name,String id,Teacher teacher)
    {
        this.name=name;
        this.id=id;
        this.teacher=teacher;
        this.cStudent=new ArrayList<>();
    }
    //getId to get course ID
    public String getId()
    {
        return id;
    }
    //getName to get course name
    public String getName()
    {
        return name;
    }
    //displaying course details
    public void display() 
    {
        System.out.println("ID: " + id + "   Name: " + name+ "  Teacher name :"+teacher.getName()+"  Teacher ID : "+teacher.getId()+"\nStudent list : ");
        for(students s : cStudent)
        {
            s.display();
        }

    }

    //addStudentC adds student to the course
    public void addStudentC(students students)
    {
        cStudent.add(students);
    }

    //removeStudentC removes student from course
    public void removeStudentC(String i)
    {
        cStudent.removeIf(c->c.getId().equals(i));
    }
}
