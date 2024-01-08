package _16_MiniProjects._04_InventoryManagementSystem;

//importing scanner function
import java.util.Scanner;

public class main 
{
    public static void main(String args[])
    {
        //initializing scanner function
        Scanner scanner = new Scanner(System.in);
        //getting number of products from user
        System.out.println("Enter number of products :");
        int n = scanner.nextInt();
        //creating warehouse object
        Warehouse warehouse =new Warehouse();
        //creating n products
        for(int i=0;i<n;i++)
        {
            // Take user input for product details
            System.out.println("Enter product ID:");
            String productId = scanner.next();

            System.out.println("Enter product name:");
            String productName = scanner.next();

            System.out.println("Enter product price:");
            double productPrice = scanner.nextDouble();

            System.out.println("Enter product Quantity:");
            int productQuantity = scanner.nextInt();

            //creating product object and adding it to warehouse
            Product product = new Product(productId, productName, productPrice,productQuantity);
            warehouse.addProduct(product);
        }
        //creating Invertory object 
        Inventory inventory = new Inventory(warehouse);

        //creaking loop variable k to access different menu
        int k;
        //runs untill k is not equals to 9
        do
        {
            //creating Inventory Management System
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.Add Product\n2.Delete Product\n3.Add Stocks\n4.Remove Stocks\n5.Add Order\n6.Cancel Order\n7.Display Products\n8.Search Product\n9.Quit");
            k = scanner.nextInt();
            System.out.println("-----------------------------------------------------------");
            switch (k) 
            {
                //case 1 adding new product to warehouse
                case 1:
                {
                    // Take user input for product details
                    System.out.println("Enter product ID:");
                    String productId = scanner.next();

                    System.out.println("Enter product name:");
                    String productName = scanner.next();

                    System.out.println("Enter product price:");
                    double productPrice = scanner.nextDouble();

                    System.out.println("Enter product Quantity:");
                    int productQuantity = scanner.nextInt();

                    //creating product object and adding it to warehouse
                    Product product = new Product(productId, productName, productPrice,productQuantity);
                    warehouse.addProduct(product);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case2 for deleting existing product from warehouse
                case 2:
                {
                    System.out.println("Enter product ID to delete product:");
                    String productId = scanner.next();
                    warehouse.removeProduct(productId);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 3 for adding stocks in existing products
                case 3:
                {
                    System.out.println("Enter product ID to add stocks :");
                    String productId = scanner.next();
                    System.out.println("Enter product Quantity to add:");
                    int productQuantity = scanner.nextInt();
                    warehouse.addStock(productId, productQuantity);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 4 for removing stocks in existing products
                case 4:
                {
                    System.out.println("Enter product ID to remove stocks :");
                    String productId = scanner.next();
                    System.out.println("Enter product Quantity to remove:");
                    int productQuantity = scanner.nextInt();
                    warehouse.removeStock(productId, productQuantity);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 5 for getting orders from user
                case 5:
                {
                    System.out.println("Enter product ID for ordering:");
                    String productId = scanner.next();
                    System.out.println("Enter product Quantity :");
                    int productQuantity = scanner.nextInt();
                    inventory.addOrder(productId, productQuantity);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 6 for canceling orders from user
                case 6:
                {
                    System.out.println("Enter product ID for canceling:");
                    String productId = scanner.next();
                    inventory.cancelOrder(productId);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 7 to display all products
                case 7:
                {
                    warehouse.display();
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 8 to display a specific product
                case 8:
                {
                    System.out.println("Enter product ID to display:");
                    String productId = scanner.next();
                    warehouse.displayProduct(productId);
                    System.out.println("-----------------------------------------------------------");
                    break;
                }
                //case 9 for exit
                case 9:
                {
                    System.out.println("------------Thank You-----------------");
                    break;
                }
                
                default:
                    System.out.println("Invaild Number");
                    System.out.println("-----------------------------------------------------------");
                    break;
            }
        }while(k!=9);
        //closing scanner function
        scanner.close();
    }
}
