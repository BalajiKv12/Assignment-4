package _16_MiniProjects._02_SchoolManagementSystem;

//importing scanner function
import java.util.Scanner;

public class main 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        //creating object studentslist, teacherslist and course list
        studentList sl = new studentList();
        TeacherList tl = new TeacherList();
        CourseList cl = new CourseList();
        //getting number of students
        System.out.print("Enter number of students in school : ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            //getting student details
            System.out.println("Enter student name :");
            String name = scanner.next();
            System.out.println("Enter student Id :");
            String id = scanner.next();
            System.out.println("Enter student grade :");
            String grade = scanner.next();

            //creating student object
            students s = new students(name, id, grade);
            //adding student in studentslist
            sl.addStudent(s);
        }

        //getting number of teachers
        System.out.print("Enter number of teachers in school : ");
        int m = scanner.nextInt();
        for(int i=0;i<m;i++)
        {
            //getting teacher details
            System.out.println("Enter Teacher name :");
            String name = scanner.next();
            System.out.println("Enter Teacher Id :");
            String id = scanner.next();

            //creating Teacher object
            Teacher t = new Teacher(name, id);
            //adding teacher in teacherslist
            tl.addTeacher(t);
        }
        
        //creaking loop variable k to access different menu
        int k;
        //runs untill k is not equals to 10
        do
        {
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.Add Student\n2.Remove Student\n3.Update Student details\n4.Display Student Details\n5.Add Teacher\n6.Remove Teacher\n7.Add Course\n8.Add Grade\n9.Display Course Details\n10.Quit");
            k=scanner.nextInt();
            System.out.println("-----------------------------------------------------------");
            switch (k) 
            {
                //case 1 adding new student in student list
                case 1:
                {
                    //getting student details
                    System.out.println("Enter student name :");
                    String name = scanner.next();
                    System.out.println("Enter student Id :");
                    String id = scanner.next();
                    System.out.println("Enter student Grade :");
                    String grade = scanner.next();

                    //creating student object
                    students s = new students(name, id, grade);
                    //adding student in studentslist
                    sl.addStudent(s);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 2 for removing student details
                case 2:
                {
                    //getting student id to delete from list
                    System.out.println("Enter student Id :");
                    String id = scanner.next();
                    sl.deleteStudent(id);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 3 for updating student list
                case 3:
                {
                    //getting student details to update in list
                    
                    System.out.println("Enter student Id :");
                    String id = scanner.next();
                    System.out.println("Enter student name :");
                    String name = scanner.next();
                    System.out.println("Enter student grade :");
                    String grade = scanner.next();
                    sl.updateStudent(id,name,grade);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 4 for displaying student details
                case 4:
                {
                    //getting student name to display from list
                    System.out.println("Enter student Name :");
                    String name = scanner.next();
                    sl.searchStudentByName(name);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 5 for adding teacher
                case 5:
                {
                    //checking whether Teacher or student
                    System.out.println("Are you Teacher: Press 1 ");
                    int y = scanner.nextInt();
                    if(y==1)
                    {
                        //getting teacher details
                        System.out.println("Enter Teacher name :");
                        String name = scanner.next();
                        System.out.println("Enter Teacher Id :");
                        String id = scanner.next();

                        //creating Teacher object
                        Teacher t = new Teacher(name, id);
                        //adding teacher in teacherslist
                        tl.addTeacher(t);
                    }
                    else
                    {
                        System.out.println("Students are not permitted to enter Teacher details. ");
                    }
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 6 for deleting teacher
                case 6:
                {
                    //checking whether Teacher or student
                    System.out.println("Are you Teacher: Press 1 ");
                    int y = scanner.nextInt();
                    if(y==1)
                    {
                        //getting teacher id to delete from list
                        System.out.println("Enter Teacher Id :");
                        String id = scanner.next();
                        tl.deleteTeacher(id);
                    }
                    else
                    {
                        System.out.println("Students are not permitted to enter Teacher details. ");
                    }
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 7 adding course
                case 7:
                {
                    //getting course details
                    System.out.println("Enter Course name :");
                    String name = scanner.next();
                    System.out.println("Enter Course Id :");
                    String id = scanner.next();
                    System.out.println("Enter teacher name : ");
                    String tname = scanner.next();
                    //creating course object
                    Course c = new Course(name, id, tl.searchTeacherByName(tname));
                    //adding course to list
                    cl.addCourse(c);
                    int e;
                    do
                    {
                        //adding or removing students in the course
                        System.out.println("1.Add students\n2.Remove Students\n0.Quit");
                        e = scanner.nextInt();
                        System.out.println("-----------------------------------------------------------");
                        switch (e) 
                        {
                        //case 1 for adding student to the course
                        case 1:
                        {
                            //getting student name to add to course
                            System.out.println("Enter student Name :");
                            String sname = scanner.next();
                            //adding student in course
                            c.addStudentC(sl.searchStudent(sname));
                            System.out.println("-----------------------------------------------------------");
                            break;
                        }
                        //case 2 for removing student from the course
                        case 2:
                        {
                            //getting student id to from the course
                            System.out.println("Enter student Id :");
                            String sid = scanner.next();
                            //removing student from course
                            c.removeStudentC(sid);
                            System.out.println("-----------------------------------------------------------");
                            break;
                        }
                        //case 0 for quit
                        case 0:
                        {
                            System.out.println("------------Thank You-----------------");
                            break;
                        }
                        default:
                            System.out.println("Invaild Number");
                            System.out.println("-----------------------------------------------------------");
                            break;
                        }
                    }while(e!=0);     
                    break; 
                }
                //case 8 for updating student grade
                case 8:
                {
                    //getting student details to update grade
                    System.out.println("Enter student Id :");
                    String id = scanner.next();
                    System.out.println("Enter student grade :");
                    String grade = scanner.next();
                    sl.updateGrade(id,grade);
                    System.out.println("-----------------------------------------------------------");
                    break;   
                }
                //case 9 for displaying course details
                case 9:
                {
                    cl.viewCourses();
                    break;
                }
                //case 10 for quit
                case 10:
                {
                    System.out.println("------------Thank You-----------------");
                    break;
                }
                
                default:
                    System.out.println("Invaild Number");
                    System.out.println("-----------------------------------------------------------");
                    break;
            }
        }while(k!=10);
        //closing scanner function
        scanner.close();
    }  
}
