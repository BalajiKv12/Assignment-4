package _16_MiniProjects._02_SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentList 
{

    private List<students> Student = new ArrayList<>();

    // adds a student
    public void addStudent(students student) 
    {
        Student.add(student);
    }

    // view all students
    public void viewStudents() 
    {
        for(students s : Student)
        {
            s.display();
        }
    }

    // Update a student's details
    public void updateStudent(String id,String n, String g) {
        for (students s : Student) 
        {
            if (s.getId().equals(id)) 
            {   
                s.setName(n);
                s.setGrade(g);
                break;
            }
        }
    }

    // Update student's grade
    public void updateGrade(String id,String g) 
    {
        for (students s : Student) 
        {
            if (s.getId().equals(id)) 
            {
                s.setGrade(g);
            }
        }
    }

    // Delete a student by ID
    public void deleteStudent(String id) 
    {
        Student.removeIf(s -> s.getId().equals(id));
    }

    // Search student by name
    public void searchStudentByName(String name) 
    {
        for (students s : Student) 
        {
            if (s.getName().equals(name)) 
            {
                s.display();
            }
        }
    }

    // Search student by name
    public students  searchStudent(String name) 
    {
        for (students s : Student) 
        {
            if (s.getName().equalsIgnoreCase(name)) 
            {
                return s;
            }
            }
        //if student not found returns null
        return null;     
    }   
}