package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SmallestNumber
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(40,20,15,18,50);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        System.out.println("Minimum : "+min.get());
    }
}
