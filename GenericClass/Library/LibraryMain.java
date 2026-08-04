package GenericClass.Library;

public class LibraryMain
{
    public static void main(String[] args)
    {
        Library<Book> library = new Library<>();
        library.addItem(new Book(101, "Diary of a Wimpy Kid", "Jeff Kinney"));
        library.addItem(new Book(102, "Harry Porter", "J K Rowling"));
        library.addItem(new Book(103, "The Psychology of Money", "Morgan Housel"));
        library.addItem(new Book(104, "It Ends With Us", "Colleen Hoover"));
        library.addItem(new Book(105, "It Starts With Us", "Colleen Hoover"));

        System.out.println("===== Library Books =====");
        library.displayItems();

        System.out.println("Total Books : " + library.getTotalItems());
    }
}