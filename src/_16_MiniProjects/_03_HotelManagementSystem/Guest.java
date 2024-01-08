package _16_MiniProjects._03_HotelManagementSystem;

public class Guest 
{
    //creating guest name , contact and roomnumber in private
    private String name;
    private String contact;
    private int roomNumber;

    // constructor
    public Guest(String name, String contact, int roomNumber) {
        this.name = name;
        this.contact = contact;
        this.roomNumber=roomNumber;
    }

    // getname method to get guest name
    public String getName() 
    {
        return this.name;
    }

    // setname method to set guest name
    public void setName(String name) 
    {
        this.name = name;
    }

    // getcontact to get guest mobile number
    public String getContact() 
    {
        return this.contact;
    }

    // contact to get guest mobile number
    public void setContact(String contact) 
    {
        this.contact = contact;
    }
    //getter for roomnumber
    public int getRoomNumber()
    {
        return roomNumber;
    }

    //display method to display guest details
    public void display()
    {
        System.out.println("Name - "+name+"  Contact - "+contact+" Room Number Booked - "+roomNumber);
    }
}