package DesignPatterns.Observer.ECommerce;

public class Customer implements Observer
{
    private String customerName;
    public Customer(String customerName)
    {
        this.customerName = customerName;
    }

    @Override
    public void update(String productName)
    {
        System.out.println(customerName + " received notification : " + productName + " is now available.");
    }
}