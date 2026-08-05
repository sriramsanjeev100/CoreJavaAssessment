package GenericClass.UpperBound;

import java.util.Arrays;
import java.util.List;

public class NumberMain
{
    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40, 50);
        List<Double> doubleList = Arrays.asList(12.5, 15.5, 20.0, 22.0);

        System.out.println();
        System.out.println("===== Integer List =====");
        NumberUtility.calculate(integerList);

        System.out.println("===== Double List =====");
        NumberUtility.calculate(doubleList);
    }
}