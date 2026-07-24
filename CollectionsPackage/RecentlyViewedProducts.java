package CollectionsPackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RecentlyViewedProducts
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer,String> products = new LinkedHashMap<>();

        products.put(101, "Laptop");
        products.put(102, "Smartphone");
        products.put(103, "Headphones");
        products.put(104, "Smart Watch");

        System.out.println("===== Display all recently viewed products. =====");
        for (Map.Entry<Integer, String> entry : products.entrySet())
        {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
        System.out.println();

        System.out.println("===== Add a newly viewed product. =====");
        System.out.print("Enter Product ID : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name : ");
        String name = sc.nextLine();
        products.put(id, name);
        System.out.println("Product Added");
        System.out.println();

        System.out.println("===== Search Product using Product ID. =====");
        System.out.print("Enter Product ID : ");
        id = sc.nextInt();
        if (products.containsKey(id))
        {
            System.out.println("Product Found");
            System.out.println("Product Name : " + products.get(id));
        }
        else
        {
            System.out.println("Product Not Found");
        }
        System.out.println();

        System.out.println("===== Update Product Name =====");
        System.out.print("Enter Product ID : ");
        id = sc.nextInt();
        sc.nextLine();
        if (products.containsKey(id))
        {
            System.out.print("Enter New Product Name : ");
            name = sc.nextLine();
            products.put(id, name);
            System.out.println("Product Updated");
        }
        else
        {
            System.out.println("Product Not Found");
        }
        System.out.println();

        System.out.println("===== Remove Product =====");
        System.out.print("Enter Product ID : ");
        id = sc.nextInt();
        if (products.containsKey(id))
        {
            products.remove(id);
            System.out.println("Product Removed");
        }
        else
        {
            System.out.println("Product Not Found");
        }
        System.out.println();

        System.out.println("===== Check whether a Product ID exists. =====");
        System.out.print("Enter Product ID : ");
        id = sc.nextInt();
        if (products.containsKey(id))
        {
            System.out.println("Product ID Exists");
        }
        else
        {
            System.out.println("Product ID Does Not Exist");
        }
        System.out.println();

        System.out.println("===== Check whether a Product Name exists. =====");
        sc.nextLine();
        System.out.print("Enter Product Name : ");
        name = sc.nextLine();
        if (products.containsValue(name))
        {
            System.out.println("Product Name Exists");
        }
        else
        {
            System.out.println("Product Name Does Not Exist");
        }
        System.out.println();

        System.out.println("===== Display all Product IDs. =====");
        for (Integer productId : products.keySet())
        {
            System.out.println(productId);
        }
        System.out.println();

        System.out.println("===== Display all Product Names. =====");
        for (String productName : products.values())
        {
            System.out.println(productName);
        }
        System.out.println();

        System.out.println("===== Display all product details. =====");
        for (Map.Entry<Integer, String> entry : products.entrySet())
        {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
        System.out.println();

        System.out.println("===== Display the total number of recently viewed products. =====");
        System.out.println(products.size());
        System.out.println();

        System.out.println("===== Add a product only if it does not already exist. =====");
        System.out.print("Enter Product ID : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name : ");
        name = sc.nextLine();
        if (products.putIfAbsent(id, name) == null)
        {
            System.out.println("Product Added");
        }
        else
        {
            System.out.println("Product ID Already Exists");
        }
        System.out.println();

        System.out.println("===== Replace the name of an existing product. =====");
        System.out.print("Enter Product ID : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter New Product Name : ");
        name = sc.nextLine();
        if (products.replace(id, name) != null)
        {
            System.out.println("Product Name Replaced");
        }
        else
        {
            System.out.println("Product Not Found");
        }
        System.out.println();

        System.out.println("===== Recently Viewed Products =====");
        for (Map.Entry<Integer, String> entry : products.entrySet())
        {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
        System.out.println();

        System.out.println("===== Clear Recently Viewed Products =====");
        products.clear();
        System.out.println("History Cleared");
        System.out.println();

        System.out.println("===== Check whether the history is empty. =====");
        if (products.isEmpty())
        {
            System.out.println("Recently Viewed History is Empty");
        }
        else
        {
            System.out.println("Recently Viewed History is Not Empty");
        }

        sc.close();
    }
}
