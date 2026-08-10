package org.LibraryManagement.menu;

import org.LibraryManagement.entity.Member;
import org.LibraryManagement.exception.MemberNotFoundException;
import org.LibraryManagement.service.MemberService;

import java.util.List;
import java.util.Scanner;

public class MemberMenu implements Menu
{
    private static final MemberService service = new MemberService();

    @Override
    public void showMenu(Scanner sc)
    {
        int choice;

        do
        {
            System.out.println("\n========== Member Management ==========");
            System.out.println("1. Add Member");
            System.out.println("2. Display Members");
            System.out.println("3. Search Member");
            System.out.println("4. Update Member");
            System.out.println("5. Delete Member");
            System.out.println("6. BACK");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1 -> addMember(sc);
                case 2 -> displayMembers();
                case 3 -> searchMember(sc);
                case 4 -> updateMember(sc);
                case 5 -> deleteMember(sc);
                case 6 -> System.out.println("Returning...");
                default -> System.out.println("Invalid Choice");
            }
        } while(choice != 6);
    }

    public static void addMember(Scanner sc)
    {
        System.out.print("Enter Member Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number : ");
        String phone = sc.nextLine();

        Member member = new Member(name, phone);
        service.createMember(member);
        System.out.println("Member Added Successfully");
    }

    public static void displayMembers()
    {
        List<Member> members = service.findAllMembers();
        if(members.isEmpty())
        {
            System.out.println("No Members Found");
        }
        else
        {
            for(Member member : members)
            {
                System.out.println(member);
                System.out.println("-----------------------------");
            }
        }
    }


    public static void searchMember(Scanner sc)
    {
        System.out.print("Enter Member ID : ");
        int memberId = sc.nextInt();
        sc.nextLine();

        try
        {
            Member member = service.findMemberById(memberId);
            System.out.println(member);
        }
        catch (MemberNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void updateMember(Scanner sc)
    {
        System.out.print("Enter Member ID : ");
        int memberId = sc.nextInt();
        sc.nextLine();

        try
        {
            Member member = service.findMemberById(memberId);

            int choice;

            do
            {
                System.out.println("\n===== Update Member =====");
                System.out.println("1. Update Name");
                System.out.println("2. Update Phone");
                System.out.println("3. Save and Exit");

                System.out.print("Enter Choice : ");
                choice = sc.nextInt();
                sc.nextLine();

                switch(choice)
                {
                    case 1:

                        System.out.print("Enter New Name : ");
                        member.setMemberName(sc.nextLine());
                        break;

                    case 2:

                        System.out.print("Enter New Phone : ");
                        member.setPhone(sc.nextLine());
                        break;

                    case 3:

                        service.updateMember(member);
                        System.out.println("Member Updated Successfully");
                        break;

                    default:

                        System.out.println("Invalid Choice");
                }

            } while(choice != 3);
        }
        catch (MemberNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteMember(Scanner sc)
    {
        System.out.print("Enter Member ID : ");
        int memberId = sc.nextInt();
        sc.nextLine();
        service.deleteMember(memberId);
        System.out.println("Member Deleted Successfully");

    }
}