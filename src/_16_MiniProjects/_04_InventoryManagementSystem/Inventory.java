package _16_MiniProjects._04_InventoryManagementSystem;

public class Inventory 
{
    //creating private warehouse object
    private Warehouse warehouse;

    //creating constructor
    public Inventory(Warehouse warehouse)
    {
        this.warehouse=warehouse;
    }

    //addOrder gets order from user
    public void addOrder(String id, int quantity)
    {
        this.warehouse.addOrder(id, quantity);
    }

    //cancelOrder cancels order from user
     public void cancelOrder(String id)
    {
        this.warehouse.cancelOrder(id);
    }
}
