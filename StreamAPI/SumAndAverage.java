package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAndAverage
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(40,20,15,18,50);
        String result = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingInt(Integer::intValue),
                        Collectors.averagingInt(Integer::intValue),
                        (sum,avg) -> "Sum : "+sum+"\nAverage : "+avg
                ));
        System.out.println(result);
    }
}
