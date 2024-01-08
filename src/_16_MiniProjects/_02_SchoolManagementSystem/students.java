package _16_MiniProjects._02_SchoolManagementSystem;

public class students implements school
{
  //creating private variables for name, id and grades
  private String name;
  private String id;
  private String grades;

  //creating constructor
  public students(String name , String id, String grades)
  {
    this.name=name;
    this.id=id;
    this.grades=grades;
  }

  // A getter method for name
  public String getName() 
  {
    return name;
  }

  // A getter method for id
  public String getId() 
  {
    return id;
  }

  // A getter method for grades
  public String getGrades() 
  {
    return grades;
  }
  
  // A setter method to get student name
  public void setName(String n)
  {
    name=n;
  }
  //setting student grade
  public void setGrade(String g)
  {
    grades = g;
  }

  //displaying student details
  public void display() 
  {
    System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grades);
  }

}
    