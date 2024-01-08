package _16_MiniProjects._02_SchoolManagementSystem;

//importing arraylist and list
import java.util.ArrayList;
import java.util.List;

public class TeacherList 
{
    //creating private teachers list
    private List<Teacher> teachers = new ArrayList<>();

    // adds a teacher into the list
    public void addTeacher(Teacher teacher) 
    {
        teachers.add(teacher);
    }
    // Delete a teacher by ID
    public void deleteTeacher(String id) 
    {
        teachers.removeIf(t -> t.getId().equals(id));
    }
    // view all teachers
    public void viewTeacher() 
    {
        for(Teacher t : teachers)
        {
            t.display();
        }
    }   

    //searching teacher by name
    public Teacher searchTeacherByName(String name) 
    {
        for (Teacher t : teachers) 
        {
            if (t.getName().equalsIgnoreCase(name)) 
            {
                return t;
            }
        }
        return null;
    }
}