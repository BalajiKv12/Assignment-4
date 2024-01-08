package _16_MiniProjects._04_InventoryManagementSystem;

//importing arraylist and list
import java.util.ArrayList;
import java.util.List;

public class Warehouse 
{
    //private list product object is created
    private List<Product> warehouse=new ArrayList<>();
    private List<Product> orders = new ArrayList<>();

    //addProduct method add product in warehouse
    public void addProduct(Product product)
    {
        warehouse.add(product);
    }

    //removeProduct method deletes product in warehouse
    public void removeProduct(String id)
    {
        warehouse.removeIf(p->p.getId().equals(id));
    }

    //addStock method adds quantity in product
    public void addStock(String id,int quantity)
    {
        for(Product p : warehouse)
        {
            if(p.getId().equals(id))
                p.setQuantity(p.getQuantity()+quantity);
        }
    }

    //removeStock method adds quantity in product
    public void removeStock(String id,int quantity)
    {
        for(Product p : warehouse)
        {
            if(p.getId().equals(id))
                if(p.getQuantity()>quantity)
                {
                    int q = p.getQuantity()-quantity;
                    p.setQuantity(q);
                }
                else
                    System.out.println("Quantity is more than stock");
        }
    }
    //addOrder method gets order from user 
    public void addOrder(String id,int quantity)
    {
        for(Product p : warehouse)
        {
            if(p.getId().equals(id))
                if(p.getQuantity()>quantity)
                {
                    int q = p.getQuantity()-quantity;
                    p.setQuantity(q);
                    System.out.println("Your Order details : Product ID : "+p.getId()+", Product Name : "+p.getName()+", Quantity :"+quantity +", Price = "+(p.getPrice()*quantity));
                    orders.add(p);
                }
                else
                    System.out.println("Quantity is more than stock");
        }
    }
    //cancelOrder method cancel order
    public void cancelOrder(String id)
    {
        for(Product p : orders)
        {
            if(p.getId().equals(id))
            {
                orders.remove(p);
                System.out.println("Your Order is cancelled");
                break;
            }
        }
    }

    //display method display all products available in warehouse
    public void display()
    {
        for(Product p : warehouse)
        {
            System.out.println(p.display());
        }
    }
    //displayorder method display all products which are ordered
    public void displayorder()
    {
        for(Product p : orders)
        {
            System.out.println(p.display());
        }
    }

    //displayProduct displays specific product
    public void displayProduct(String id)
    {
        for(Product p : warehouse)
        {
            if(p.getId().equals(id))
                System.out.println(p.display());
        }
    }
}
