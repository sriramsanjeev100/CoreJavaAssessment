package org.LibraryManagement.menu;

public class MenuFactory
{
    public static Menu getMenu(int choice)
    {
        return switch (choice)
        {
            case 1 -> new BookMenu();
            case 2 -> new MemberMenu();
            case 3 -> new BorrowMenu();
            default -> null;
        };
    }
}