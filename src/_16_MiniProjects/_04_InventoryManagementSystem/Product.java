package _16_MiniProjects._04_InventoryManagementSystem;

public class Product
{
    //declaring product name,id,quantity and price in private
    private String id;
    private String name;
    private double price;
    private int quantity;

    //creating constructor
    public Product(String id, String name, double price, int quantity) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity=quantity;
    }

    //getName method to return name of the product
    public String getName()
    {
        return name;
    }
    //getId method to return product ID
    public String getId()
    {
        return id;
    }
    //getPrice method to return product price
    public double getPrice()
    {
        return price;
    }
    //getQuantity method to return product quantity
    public int getQuantity()
    {
        return quantity;
    }

    //setName to set product name
    public void setName(String name)
    {
        this.name=name;
    }
    //setPrice to set product price
    public void setPrice(Double price)
    {
        this.price=price;
    }
    //setQuantity to set product quantity
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    //display method to display product details
    public String display()
    {
        return("Product ID : "+id+"\nProduct Name : "+name+"\nProduct price : "+price+"\nQuantity : "+quantity);
    }
}