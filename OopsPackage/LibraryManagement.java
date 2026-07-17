package OopsPackage;

class Book
{
    int bookId;
    String title;
    String author;
    double price;
    int availableCopies;

    public Book(int bookId, String title, String author, double price, int availableCopies)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.availableCopies = availableCopies;
    }

    void borrowBook(int quantity)
    {
        if (quantity<availableCopies)
        {
            availableCopies -= quantity;
            System.out.println(quantity+" Book(s) has been borrowed.");
        }
        else
        {
            System.out.println("Not Enough copies available.");
        }
    }

    void returnBook(int quantity)
    {
        availableCopies += quantity;
        System.out.println(quantity+" Book(s) has been returned.");
    }

    void displayBooks()
    {
        System.out.println("Book Details:");
        System.out.println("Book Id: " + this.bookId);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("Available Copies: " + this.availableCopies);
    }
}

public class LibraryManagement
{
    public static void main(String[] args)
    {
        Book book1 = new Book(1, "Introduction to Object Oriented Programming", "Sriram", 1000.0, 5);
        book1.displayBooks();

        book1.borrowBook(4);
        book1.displayBooks();

        book1.returnBook(2);
        book1.displayBooks();

    }
}
