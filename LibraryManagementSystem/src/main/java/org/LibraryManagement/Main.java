package org.LibraryManagement;

import org.LibraryManagement.menu.Menu;
import org.LibraryManagement.menu.MenuFactory;
import org.LibraryManagement.util.HibernateUtil;

import java.util.Scanner;

public class Mainno
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n===== Library Management System =====");

            System.out.println("1. Book Management");
            System.out.println("2. Member Management");
            System.out.println("3. Borrow Book");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 3)
            {
                Menu menu = MenuFactory.getMenu(choice);
                menu.showMenu(sc);
            }
            else if (choice == 4)
            {
                HibernateUtil.shutdown();
                System.out.println("Thank You!");
            }
            else
            {
                System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}