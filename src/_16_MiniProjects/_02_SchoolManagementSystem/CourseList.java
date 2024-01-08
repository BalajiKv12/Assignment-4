package _16_MiniProjects._02_SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class CourseList 
{
    //creating private teachers list
    private List<Course> courses = new ArrayList<>();

    // adds a course into the list
    public void addCourse(Course course) 
    {
        courses.add(course);
    }
    // Delete a course by ID
    public void deleteCourse(String id) 
    {
        courses.removeIf(c-> c.getId().equals(id));
    }
    // view all courses
    public void viewCourses() 
    {
        for(Course c : courses)
        {
            c.display();
        }
    }
}
