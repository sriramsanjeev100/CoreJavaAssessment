package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurence
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1, 4, 2, 5, 4, 3);
        Map<Integer,Long> count = numbers.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting())
                );

        System.out.println(count);
    }
}
