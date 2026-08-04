package DesignPatterns.Observer.ECommerce;

public class ProductMain
{
    public static void main(String[] args)
    {
        Product laptop = new Product("Lenovo IdeaPad Slim 5i");

        Customer c1 = new Customer("Sriram");
        Customer c2 = new Customer("Leo");
        Customer c3 = new Customer("John");
        Customer c4 = new Customer("Aaron");

        laptop.addObserver(c1);
        laptop.addObserver(c2);
        laptop.addObserver(c3);
        laptop.addObserver(c4);

        System.out.println();
        System.out.println("Laptop Status : Out of Stock");

        System.out.println();
        System.out.println("Stock Updated...");
        System.out.println();

        laptop.setAvailable(true);
    }
}