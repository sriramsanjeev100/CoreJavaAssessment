package GenericClass.Library2;
import java.util.List;

public class DisplayUtility
{
    public static void displayItems(List<?> list)
    {
        for (Object item : list)
        {
            System.out.println(item);
            System.out.println();
        }
    }
}