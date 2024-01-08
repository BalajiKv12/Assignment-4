//initializing package
package _16_MiniProjects._01_OnlineShoppingSystem;


public class Product implements ShoppingSystem
{
    //declaring product name,idand price in private
    private String id;
    private String name;
    private double price;

    //creating constructor
    public Product(String id, String name, double price) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
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

    //display method to display product details
    public String display()
    {
        return("Product ID : "+id+"\nProduct Name : "+name+"\nProduct price : "+price);
    }
}
