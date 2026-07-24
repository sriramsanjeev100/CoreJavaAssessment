package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNamesExample
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Rahul","Anu","Vivek","Meera","John","Alex");

        System.out.println("===== 1.Print all names. =====");
        names.stream()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== 2. Convert names to uppercase. =====");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== 3. Convert names to lowercase. =====");
        names.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== 4.Find names starting with 'A'. =====");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== 5.Find names ending with 'a'. =====");
        names.stream()
                .filter(name -> name.endsWith("a"))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== 6.Find names having length greater than 4. =====");
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== 7. Sort names alphabetically. =====");
        names.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== 8. Sort names by length. =====");
        names.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== 9. Find longest name. =====");
        System.out.println(
                names.stream()
                        .max(Comparator.comparing(String::length))
                        .get());
        System.out.println();

        System.out.println("===== 10. Find shortest name. =====");
        System.out.println(
                names.stream()
                        .min(Comparator.comparing(String::length))
                        .get());
        System.out.println();

        System.out.println("===== 11. Count names starting with 'A'. =====");
        System.out.println(
                names.stream()
                        .filter(name -> name.startsWith("A"))
                        .count());
        System.out.println();

        System.out.println("===== 12. Join all names with comma. =====");
        System.out.println(
                names.stream()
                        .collect(Collectors.joining(", ")));
        System.out.println();
    }
}
