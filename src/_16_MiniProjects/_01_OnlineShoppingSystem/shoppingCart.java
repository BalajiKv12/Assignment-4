//initializing package
package _16_MiniProjects._01_OnlineShoppingSystem;
//importing list and array list package
import java.util.ArrayList;
import java.util.List;

public class shoppingCart 
{
    //creating list of product objects in private
    private List<Product> products = new ArrayList<>();

    //addProduct method to add products in shopping cart
    public void addProduct(Product product) 
    {
        this.products.add(product);
    }

    //removeProduct method to remove products in shopping cart
    public void removeProduct(String id) 
    {
        for(Product p : products)
        {
            if(id.equals(p.getId()))
            {
                products.remove(p);
                break;
            }
        }
    }

    //removeall method removes all products in cart
    public void removeAll() 
    {
        this.products.removeAll(products);
    }

    //display method is to display products in cart
    public void display()
    {
        for(Product p : products)
        {
            System.out.println(p.display());
        }
    }

    //amount method is calculate total price of products in the cart
    public Double amount()
    {
        double amount=0;
        for(Product p : products)
        {
            amount = amount + p.getPrice();
        }
        return amount;
    }

}
