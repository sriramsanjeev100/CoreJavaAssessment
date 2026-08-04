package GenericClass.Library;
import java.util.ArrayList;

public class Library<T>
{
    private ArrayList<T> items = new ArrayList<>();
    public void addItem(T item)
    {
        items.add(item);
    }

    public void displayItems()
    {
        for (T item : items)
        {
            System.out.println(item);
            System.out.println();
        }
    }

    public int getTotalItems()
    {
        return items.size();
    }
}