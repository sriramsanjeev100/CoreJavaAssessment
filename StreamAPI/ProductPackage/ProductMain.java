package StreamAPI.ProductPackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductMain
{
    public static void main(String[] args)
    {
        List<Product> products = Arrays.asList(
                new Product("Laptop",55000,4.8),
                new Product("Mouse",1200,4.2),
                new Product("Monitor",8000,4.6)
        );

        Optional<Product> highestRated = products.stream()
                .max(Comparator.comparing(Product::getRating));

        Double averagePrice = products.stream()
                .collect(Collectors.averagingDouble(Product::getPrice));

        System.out.println();
        System.out.println("Highest Rated Price: " + highestRated.get());
        System.out.println("Average Price: " + averagePrice);
    }
}
