package StreamAPI;

import java.util.HashMap;

public class ShoppingCart
{
    public static void main(String[] args)
    {
        HashMap<String, Double> cart = new HashMap<>();

        cart.put("Laptop", 55000.0);
        cart.put("Mouse", 800.0);
        cart.put("Keyboard", 1500.0);
        cart.put("Monitor", 12000.0);

        cart.remove("Mouse");

        System.out.println("Products in Cart");
        cart.forEach((product, price) ->
                System.out.println(product + " : " + price));
        System.out.println();

        double total = cart.values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println("Total Price = " + total);
        System.out.println();

        System.out.println("Product with Price");
        cart.entrySet()
                .stream()
                .forEach(entry ->
                        System.out.println(entry.getKey() + " : " + entry.getValue()));

        System.out.println();
        String search = "Keyboard";

        cart.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(search))
                .forEach(entry ->
                        System.out.println("Price of " + search + " = " + entry.getValue()));
    }
}