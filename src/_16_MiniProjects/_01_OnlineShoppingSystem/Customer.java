//initializing package
package _16_MiniProjects._01_OnlineShoppingSystem;

public class Customer implements ShoppingSystem
{
    //declaring customer name,id and shopping cart object in private
    private String custId;
    private String custName;
    private shoppingCart cart;

    //creating constructor
    public Customer(String custId, String custName) 
    {
        this.custId = custId;
        this.custName = custName;
        this.cart = new shoppingCart();
    }

    //getName method to return name of the customer
    public String getName()
    {
        return custName;
    }
    //getId method to return customer ID
    public String getId()
    {
        return custId;
    }

    //setName to set customer name
    public void setName(String name)
    {
        custName=name;
    } 

    //displaying customers shopping cart
    public void display()
    {
        System.out.println("Products in "+custName+" cart :");
        cart.display();
    }
}