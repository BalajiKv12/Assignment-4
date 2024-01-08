//initializing package
package _16_MiniProjects._01_OnlineShoppingSystem;
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

        //creating cart and customer objects
        customerList customer = new customerList();
        shoppingCart cart = new shoppingCart();
        //creating n numbers of product objects
        Product[] product = new Product[n];
        for(int i=0;i<n;i++)
        {
            // Take user input for product details
            System.out.println("Enter product ID:");
            String productId = scanner.next();

            System.out.println("Enter product name:");
            String productName = scanner.next();

            System.out.println("Enter product price:");
            double productPrice = scanner.nextDouble();

            product[i]= new Product(productId, productName, productPrice);
        }
        //creaking loop variable k to access different menu
        int k;
        //runs untill k is not equals to 3
        do
        {
            //creating online shopping menu
            System.out.println("-----------------------------------------------------------");
            System.out.println("1.Create new Customer Account \n2.Delete Customer Account \n3.LogOut");
            k = scanner.nextInt();
            switch (k) 
            {
                //case 1 creating customer account
                case 1:
                {
                    // Take user input for customer details
                    System.out.println("Enter customer ID:");
                    String customerId = scanner.next();

                    System.out.println("Enter customer name:");
                    String customerName = scanner.next();

                    // Create a new customer with user input
                    Customer c = new Customer(customerId, customerName);
                    customer.addCustomer(c);
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Welcome "+c.getName());
                    
                    int e;
                    //runs untill e is not equals to 3
                    do
                    {
                        //asking user whether they want to purchase products
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("1.Add Products to cart \n2.Delete products from cart \n3.CheckOut");
                        e = scanner.nextInt();
                        switch (e) 
                        {
                            //case 1 for add products in cart
                            case 1:
                            {
                                for(int i = 0;i<n;i++)
                                {
                                    System.out.println(product[i].display());
                                }
                                String id;
                                int j;
                                //adds product to the cart untill j==1
                                do
                                {
                                    System.out.println("-----------------------------------------------------------");
                                    System.out.println("Enter ProductId to add the product in the cart :");
                                    id=scanner.next();
                                    for(int i = 0;i<n;i++)
                                    {
                                        if(id.equals(product[i].getId()))
                                        {
                                            cart.addProduct(product[i]);
                                        }
                                        
                                    }
                                    System.out.println("1.Continue \n2.End");
                                    j=scanner.nextInt();
                                    
                                }while(j==1);
                                
                                break;
                            }
                            //case 2 for deleting products from cart
                            case 2:
                            {
                                System.out.println("------------------------Shopping Cart----------------------------");
                                cart.display();
                                System.out.println("Enter ProductId to remove the product in the cart :");
                                String id=scanner.next();
                                cart.removeProduct(id);
                                break;
                            }
                            //case 3 for checkout
                            case 3:
                            {
                                System.out.println("-----------------------CheckOut---------------------------");
                                System.out.println("Your Product List : ");
                                cart.display();
                                System.out.println("-----------------------------------------------------------");
                                System.out.println("Your Total Amount : "+cart.amount());
                                cart.removeAll();
                                break;
                            }
                            default:
                                System.out.println("Enter valid number");
                                System.out.println("---------Thank You-----------------");
                                break;
                        }
                    }while(e!=3);
                    break;
                }
                //case 2 for deleting customer account
                case 2:
                    //getting customer id to delete customer account
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Enter customer ID:");
                    String customerId = scanner.next();
                    customer.removeCustomer(customerId);
                    break;
                //case 3 exit message
                case 3:
                    System.out.println("---------Thank You-----------------");
                    break;

                default:
                    System.out.println("Enter valid number");
                    System.out.println("-----------------------------------------------------------");
                    break;
            }

        }while(k!=3);
        //closing scanner function
        scanner.close();
    }   
}
