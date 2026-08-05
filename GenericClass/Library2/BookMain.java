package GenericClass.Library2;

import java.util.ArrayList;
import java.util.List;

public class BookMain
{
    public static void main(String[] args)
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Diary of a Wimpy Kid"));
        books.add(new Book(102, "Harry Porter"));
        books.add(new Book(103, "The Psychology of Money"));
        books.add(new Book(104, "It Ends With Us"));
        books.add(new Book(105, "It Starts With Us"));

        System.out.println();
        System.out.println("===== Library Books =====");
        System.out.println();
        DisplayUtility.displayItems(books);
    }
}