//initializing package
package _16_MiniProjects._01_OnlineShoppingSystem;

//importing list and arraylist 
import java.util.ArrayList;
import java.util.List;

public class customerList 
{
    //creating list of customer objects in private
    private List<Customer> customer = new ArrayList<>();

    //addCustomer method to add new customer
    public void addCustomer(Customer customer) 
    {
        this.customer.add(customer);
    }

    //removeCustomer method to delete customer account
    public void removeCustomer(String id) 
    {
        for(Customer c : customer)
        {
            if(id.equals(c.getId()))
            {
                System.out.println("Customer "+c.getName()+" removed");
                customer.remove(c);
                break;
            }
        }
    }


}
