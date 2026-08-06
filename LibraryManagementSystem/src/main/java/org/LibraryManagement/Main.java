package org.LibraryManagement;

import org.LibraryManagement.entity.Book;
import org.LibraryManagement.service.BookService;
import org.LibraryManagement.util.HibernateUtil;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BookService service = new BookService();

        int choice;
        do
        {
            System.out.println("\n========== Library Management ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:

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

                    Book book = new Book(title, author, category,
                            totalCopies, availableCopies);

                    service.createBook(book);
                    System.out.println("Book Added Successfully");
                    break;

                case 2:

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

                    break;

                case 3:

                    System.out.print("Enter Book ID : ");
                    int searchId = sc.nextInt();

                    Book searchedBook = service.findBookById(searchId);
                    if (searchedBook != null)
                    {
                        System.out.println(searchedBook);
                    }
                    else
                    {
                        System.out.println("Book Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to Update : ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    Book updateBook = service.findBookById(updateId);

                    if (updateBook != null)
                    {
                        System.out.print("Enter New Title : ");
                        updateBook.setTitle(sc.nextLine());

                        System.out.print("Enter New Author : ");
                        updateBook.setAuthor(sc.nextLine());

                        System.out.print("Enter New Category : ");
                        updateBook.setCategory(sc.nextLine());

                        System.out.print("Enter Total Copies : ");
                        updateBook.setTotalCopies(sc.nextInt());

                        System.out.print("Enter Available Copies : ");
                        updateBook.setAvailableCopies(sc.nextInt());

                        service.updateBook(updateBook);

                        System.out.println("Book Updated Successfully");
                    }
                    else
                    {
                        System.out.println("Book Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Book ID to Delete : ");
                    int deleteId = sc.nextInt();

                    service.deleteBook(deleteId);
                    System.out.println("Book Deleted Successfully");
                    break;

                case 6:

                    System.out.println("Thank You!");
                    HibernateUtil.shutdown();
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
    }
}