package DesignPatterns.Observer.ECommerce;

import java.util.ArrayList;
import java.util.List;

public class Product
{
    private String productName;
    private boolean available;
    private List<Observer> customers = new ArrayList<>();

    public Product(String productName)
    {
        this.productName = productName;
        this.available = false;
    }

    public void addObserver(Observer observer)
    {
        customers.add(observer);
        System.out.println("Customer registered for notification.");
    }

    public void removeObserver(Observer observer)
    {
        customers.remove(observer);
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
        if(this.available)
        {
            notifyCustomers();
        }
    }

    public void notifyCustomers()
    {
        System.out.println();
        System.out.println(productName + " is back in stock.");
        System.out.println();

        for(Observer customer : customers)
        {
            customer.update(productName);
        }
    }
}