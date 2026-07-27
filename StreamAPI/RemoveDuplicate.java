package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 6, 3, 1, 5, 7);
        Set<Integer> unique = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(unique);
    }
}
