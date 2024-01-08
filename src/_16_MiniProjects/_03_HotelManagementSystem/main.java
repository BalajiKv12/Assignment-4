package _16_MiniProjects._03_HotelManagementSystem;

//importing scanner function
import java.util.Scanner;


public class main 
{
    public static void main(String args[])
    {
        //initializing scanner function
        Scanner scanner = new Scanner(System.in);
        //creating guestList object
        GuestList guests = new GuestList();
        
        //creating 10 rooms
        Room[] rooms = new Room[10];
        for(int i=0;i<10;i++)
        {
            rooms[i]=new Room((i+100));         
        }
        //creating 10 elite rooms
        EliteRooms[] elite = new EliteRooms[10];
        for(int i=0;i<10;i++)
        {
            elite[i]=new EliteRooms((i+150));         
        }
        //n is loop variable to access different case and run untill n!=3
        int n;

        do
        {
            //showing number of rooms in hotel
            System.out.println("-----------------------------------------------------------");
            System.out.println("Rooms Available in the hotel");
            System.out.println("1.Single Bedroom without A/C \n2.Double Bedroom with A/C\n3.Quit");
            n=scanner.nextInt();
            //printing rooms available in hotel
            switch (n) 
            {
                //case 1 for single bedroom
                case 1:
                {
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(rooms[i].display());
                    }
                    System.out.println("-------------------------Single Bedroom----------------------------");
                    //asking user to select room
                    int k;
                    do
                    {
                        System.out.println("1.Book Room \n2.Check Avaibality\n3.Reserve Room\n4.Quit");
                        k= scanner.nextInt();
                        switch (k) 
                        {
                            case 1:
                            {
                                System.out.println("Enter Room number to book");
                                int r=scanner.nextInt();
                                for(int i =0;i<10;i++)
                                {
                                    if(rooms[i].getId()==r && rooms[i].getAvaibality().equals("Available"))
                                    {
                                        //changing room avaibality
                                        rooms[i].setAvaibality("Not Available");
                                       //getting guest details 
                                        System.out.println("Enter your name : ");
                                        String a = scanner.next();
                                        System.out.println("Enter mobile number");
                                        String m = scanner.next();
                                        Guest g = new Guest(a, m, r);
                                        //adding guest details in guest list
                                        guests.addGuest(g);
                                        //getting how many days to stay in room
                                        System.out.println("Enter how may days to stay? ");
                                        int c=scanner.nextInt();
                                        //printing bill
                                        System.out.println("Your Bill for "+c+" days is "+(c*1000)+"\n Thank You - "+g.getName());
                                        System.out.println("-------------------------Single Bedroom----------------------------");
                                    }
                                    else if(rooms[i].getId()==r && rooms[i].getAvaibality().equals("Not Available")) 
                                    {
                                        System.out.println("Room is already booked");
                                        System.out.println("-------------------------Single Bedroom----------------------------");
                                    }
                                }
                                break;
                            }
                            //case 2 for check avaibality
                            case 2:
                            {
                                for(int i=0;i<10;i++)
                                {
                                    System.out.println(rooms[i].display());
                                }
                                System.out.println("-------------------------Single Bedroom----------------------------");
                                break;
                            }
                            //case 3 for reservation
                            case 3:
                            {
                                System.out.println("Enter Room number to reserve");
                                int r=scanner.nextInt();
                                for(int i =0;i<10;i++)
                                {
                                    if(rooms[i].getId()==r && rooms[i].getAvaibality().equals("Available"))
                                    {
                                        //changing room avaibality
                                        rooms[i].setAvaibality("Not Available");
                                       //getting guest details 
                                        System.out.println("Enter your name : ");
                                        String a = scanner.next();
                                        System.out.println("Enter mobile number");
                                        String m = scanner.next();
                                        Guest g = new Guest(a, m, r);
                                        //adding guest details in guest list
                                        guests.addGuest(g);
                                        //getting check in date
                                        System.out.println("Enter Check in date : ");
                                        String s = scanner.next();
                                        //getting how many days to stay in room
                                        System.out.println("Enter how may days to stay? ");
                                        int c=scanner.nextInt();
                                        //printing bill 50 for reservation charges
                                        int bill = c*1000+50;
                                        System.out.println("Your Bill for "+c+" days is "+bill+"\n Thank You - "+g.getName());
                                        System.out.println("-------------------------Single Bedroom----------------------------");
                                    }
                                    else if(rooms[i].getId()==r && rooms[i].getAvaibality().equals("Not Available")) 
                                    {
                                        //checking if the room is already booked
                                        System.out.println("Room is already booked");
                                        System.out.println("-------------------------Single Bedroom----------------------------");
                                    }
                                }
                                break;
                            }
                            //case 4 quit
                            case 4:
                            {
                                System.out.println("---------Thank You-----------");
                                break;
                            }
                            default:
                                System.out.println("Invaild number");
                                System.out.println("-------------------------Single Bedroom----------------------------");

                                break;
                        }
                    }while(k!=4);
                    break;
                }
                //case 2 for double bedroom
                case 2:
                {
                    for(int i=0;i<10;i++)
                    {
                        System.out.println(elite[i].display());
                    }
                    System.out.println("------------------------Double Bedroom-------------------------------");

                    //asking user to select room
                    int k;
                    do
                    {
                        System.out.println("1.Book Room \n2.Check Avaibality\n3.Reserve Room\n4.Quit");
                        k= scanner.nextInt();
                        switch (k) 
                        {
                            case 1:
                            {
                                System.out.println("Enter Room number to book");
                                int r=scanner.nextInt();
                                for(int i =0;i<10;i++)
                                {
                                    if(elite[i].getId()==r && elite[i].getAvaibality().equals("Available"))
                                    {
                                        //changing room avaibality
                                        elite[i].setAvaibality("Not Available");
                                       //getting guest details 
                                        System.out.println("Enter your name : ");
                                        String a = scanner.next();
                                        System.out.println("Enter mobile number");
                                        String m = scanner.next();
                                        Guest g = new Guest(a, m, r);
                                        //adding guest details in guest list
                                        guests.addGuest(g);
                                        //getting how many days to stay in room
                                        System.out.println("Enter how may days to stay? ");
                                        int c=scanner.nextInt();
                                        //printing bill
                                        System.out.println("Your Bill for "+c+" days is "+(c*2000)+"\n Thank You - "+g.getName());
                                        System.out.println("------------------------Double Bedroom-------------------------------");                                    }
                                    else if(elite[i].getId()==r && elite[i].getAvaibality().equals("Not Available")) 
                                    {
                                        //checking if the room is already booked
                                        System.out.println("Room is already booked");
                                        System.out.println("------------------------Double Bedroom-------------------------------");
                                    }
                                }
                                break;
                            }
                            //case 2 for check avaibality
                            case 2:
                            {
                                for(int i=0;i<10;i++)
                                {
                                    System.out.println(elite[i].display());
                                }
                                System.out.println("------------------------Double Bedroom-------------------------------");
                                break;
                            }
                            //case 3 for reservation
                            case 3:
                            {
                                System.out.println("Enter Room number to reserve");
                                int r=scanner.nextInt();
                                for(int i =0;i<10;i++)
                                {
                                    if(elite[i].getId()==r && elite[i].getAvaibality().equals("Available"))
                                    {
                                        //changing room avaibality
                                        elite[i].setAvaibality("Not Available");
                                       //getting guest details 
                                        System.out.println("Enter your name : ");
                                        String a = scanner.next();
                                        System.out.println("Enter mobile number");
                                        String m = scanner.next();
                                        Guest g = new Guest(a, m, r);
                                        //adding guest details in guest list
                                        guests.addGuest(g);
                                        //getting check in date
                                        System.out.println("Enter Check in date : ");
                                        String s = scanner.next();
                                        //getting how many days to stay in room
                                        System.out.println("Enter how may days to stay? ");
                                        int c=scanner.nextInt();
                                        //printing bill 50 for reservation charges
                                        int bill = c*2000+50;
                                        System.out.println("Your Bill for "+c+" days is "+bill+"\n Thank You - "+g.getName());
                                        System.out.println("------------------------Double Bedroom-------------------------------");
                                    }
                                    else if(elite[i].getId()==r && elite[i].getAvaibality().equals("Not Available")) 
                                    {
                                        //checking if the room is already booked
                                        System.out.println("Room is already booked");
                                        System.out.println("------------------------Double Bedroom-------------------------------");
                                    }
                                }
                                break;
                            }
                            //case 4 quit
                            case 4:
                            {
                                System.out.println("---------Thank You-----------");
                                break;
                            }
                            default:
                                System.out.println("Invaild number");
                                System.out.println("-------------------------Double Bedroom----------------------------");

                                break;
                        }
                    }while(k!=4);
                    break;
                }
                //case 3 for quit
                case 3:
                {
                    System.out.println("---------Thank You-----------");
                    break;
                }
                default:
                    System.out.println("Invaild number");
                    System.out.println("---------------------------------------------------");
                    break;
            } 
        }while(n!=3);

        //printing guest details
        System.out.println("1.View your account\n2.Quit");
        n=scanner.nextInt();
        switch (n) 
        {
            case 1:
            {
                System.out.println("Enter your name ");
                String q = scanner.next();
                guests.display(q);
                break;
            }
            default:
                System.out.println("---------Thank You-----------");
                break;
        }
        //closing scanner function
        scanner.close();
        
    }
}
