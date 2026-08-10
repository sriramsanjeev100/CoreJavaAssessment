package org.LibraryManagement.menu;

import org.LibraryManagement.entity.Book;
import org.LibraryManagement.exception.BookNotFoundException;
import org.LibraryManagement.service.BookService;

import java.util.List;
import java.util.Scanner;

public class BookMenu implements Menu
{
    private static final BookService service = new BookService();
    @Override
    public void showMenu(Scanner sc)
    {
        int choice;
        do
        {
            System.out.println("\n========== Book Management ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. BACK");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1 -> addBook(sc);
                case 2 -> displayBooks();
                case 3 -> searchBook(sc);
                case 4 -> updateBook(sc);
                case 5 -> deleteBook(sc);
                case 6 -> System.out.println("Returning...");
                default -> System.out.println("Invalid Choice");
            }
        } while(choice != 6);
    }

    public static void addBook(Scanner sc)
    {
        System.out.print("Enter Title : ");
        String title = sc.nextLine();

        System.out.print("Enter Author : ");
        String author = sc.nextLine();

        System.out.print("Enter Category : ");
        String category = sc.nextLine();

        System.out.print("Enter Total Copies : ");
        int totalCopies = sc.nextInt();

        System.out.print("Enter Available Copies : ");
        int availableCopies = sc.nextInt();

        Book book = new Book(title, author, category, totalCopies, availableCopies);
        service.createBook(book);
        System.out.println("Book Added Successfully");
    }

    public static void displayBooks()
    {
        List<Book> books = service.findAllBooks();
        if (books.isEmpty())
        {
            System.out.println("No Books Available");
        }
        else
        {
            System.out.println("\n========== BOOK LIST ==========");
            for (Book b : books)
            {
                System.out.println(b);
                System.out.println("--------------------------------");
            }
        }
    }

    public static void searchBook(Scanner sc)
    {
        System.out.print("Enter Book ID : ");
        int searchId = sc.nextInt();

        try
        {
            Book book = service.findBookById(searchId);
            System.out.println(book);
        }
        catch (BookNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void updateBook(Scanner sc)
    {
        System.out.print("Enter Book ID to Update : ");
        int updateId = sc.nextInt();
        sc.nextLine();
        try
        {
            Book book = service.findBookById(updateId);

            int choice;

            do
            {
                System.out.println("\n===== Update Book =====");
                System.out.println("1. Update Title");
                System.out.println("2. Update Author");
                System.out.println("3. Update Category");
                System.out.println("4. Update Total Copies");
                System.out.println("5. Update Available Copies");
                System.out.println("6. Save and Exit");
                System.out.print("Enter Choice : ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice)
                {
                    case 1:

                        System.out.print("Enter New Title : ");
                        book.setTitle(sc.nextLine());
                        break;

                    case 2:

                        System.out.print("Enter New Author : ");
                        book.setAuthor(sc.nextLine());
                        break;

                    case 3:

                        System.out.print("Enter New Category : ");
                        book.setCategory(sc.nextLine());
                        break;

                    case 4:

                        System.out.print("Enter New Total Copies : ");
                        book.setTotalCopies(sc.nextInt());
                        sc.nextLine();
                        break;

                    case 5:

                        System.out.print("Enter New Available Copies : ");
                        book.setAvailableCopies(sc.nextInt());
                        sc.nextLine();
                        break;

                    case 6:

                        service.updateBook(book);
                        System.out.println("Book Updated Successfully");
                        break;

                    default:

                        System.out.println("Invalid Choice");
                }

            } while (choice != 6);
        }
        catch (BookNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteBook(Scanner sc)
    {
        System.out.print("Enter Book ID to Delete : ");
        int deleteId = sc.nextInt();

        service.deleteBook(deleteId);
        System.out.println("Book Deleted Successfully");
    }
}