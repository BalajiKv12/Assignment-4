package _16_MiniProjects._03_HotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class GuestList 
{
    //creating guest list to add guests
    private List<Guest> guests = new ArrayList<>();

    //addGuest method to add new guest
    public void addGuest(Guest guest) 
    {
        this.guests.add(guest);
    }

    //display guest details
    public void display(String q)
    {
        for(Guest g : guests)
        {
            if(g.getName().equals(q))
                g.display();
        }
    }
}

