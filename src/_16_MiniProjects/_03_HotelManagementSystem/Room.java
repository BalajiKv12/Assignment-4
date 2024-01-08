//initializing package
package _16_MiniProjects._03_HotelManagementSystem;

public class Room implements Hotel
{
    //declaring room id and avaibality in private
    private int id;
    private String avaibality;
    private String roomtype;

    //creating constructor
    public Room(int id) 
    {
        this.id = id;
        this.avaibality = "Available";
        this.roomtype="Single Bedroom without A/C";
    }

    //getId method to return room ID
    public int getId()
    {
        return id;
    }
    //getAvaibality to get room avaibality
    public String getAvaibality()
    {
        return avaibality;
    }
    //getRoomType to get room type
    public String getRoomType()
    {
        return roomtype;
    }

    //setAvaibality to set room avaibality
    public void setAvaibality(String a)
    {
        this.avaibality=a;
    }

    //display method to display room details
    public String display()
    {
        return("Room Number : "+id+"  Room Avaibality : "+avaibality+"  Room type : "+roomtype);
    }
}
