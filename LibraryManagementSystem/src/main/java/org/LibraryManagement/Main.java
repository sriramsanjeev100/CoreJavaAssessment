package org.LibraryManagement;

import org.LibraryManagement.menu.BookMenu;
import org.LibraryManagement.menu.MemberMenu;
import org.LibraryManagement.util.HibernateUtil;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice;

        do
        {
            System.out.println("\n========== Library Management System ==========");
            System.out.println("1. Book Management");
            System.out.println("2. Member Management");
            System.out.println("3. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1:

                    BookMenu.showMenu(sc);
                    break;

                case 2:

                    MemberMenu.showMenu(sc);
                    break;

                case 3:

                    HibernateUtil.shutdown();
                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);

        sc.close();
    }
}