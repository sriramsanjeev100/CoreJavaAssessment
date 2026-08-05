package GenericClass.UpperBound;
import java.util.List;

public class NumberUtility
{
    public static void calculate(List<? extends Number> numbers)
    {
        double total = 0;
        for (Number number : numbers)
        {
            total += number.doubleValue();
        }

        double average = total / numbers.size();

        System.out.println("Numbers : " + numbers);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        System.out.println();
    }
}