package GenericClass.Library2;

public class Book
{
    private int bookId;
    private String title;

    public Book(int bookId, String title)
    {
        this.bookId = bookId;
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "Book ID : " + bookId + "\nTitle : " + title;
    }
}