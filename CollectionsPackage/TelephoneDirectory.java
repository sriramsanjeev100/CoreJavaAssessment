package CollectionsPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneDirectory
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String, String> directory = new HashMap<>();

        directory.put("8848703725", "Sriram");
        directory.put("9876543210", "Rahul");
        directory.put("9876543211", "Anu");

        System.out.println("=== Display All Contacts ===");
        for (Map.Entry<String, String> contact : directory.entrySet())
        {
            System.out.println(contact.getKey() + " : " + contact.getValue());
        }
        System.out.println();

        System.out.println("=== Search a contact by phone number. ===");
        System.out.print("Enter Phone Number to Search : ");
        String phone = sc.nextLine();

        if (directory.containsKey(phone))
        {
            System.out.println("Contact Found");
            System.out.println("Name : " + directory.get(phone));
            System.out.println("Phone : " + phone);
        }
        else
        {
            System.out.println("Contact Not Found");
        }
        System.out.println();

        System.out.println("=== Update a contact's name. ===");
        directory.replace("9876543211", "Sona");
        System.out.println("9876543211 : " + directory.get("9876543211"));
        System.out.println();

        System.out.println("=== Delete a contact by phone number. ===");
        System.out.print("Enter Phone Number : ");
        phone = sc.nextLine();

        if (directory.containsKey(phone))
        {
            directory.remove(phone);
            System.out.println("Contact Deleted Successfully");
        }
        else
        {
            System.out.println("Contact Not Found");
        }
        System.out.println();

        System.out.println("=== Check whether a phone number exists. ===");
        System.out.print("Enter Phone Number : ");
        phone = sc.nextLine();

        if (directory.containsKey(phone))
        {
            System.out.println("Phone Number Exists");
        }
        else
        {
            System.out.println("Phone Number Does Not Exist");
        }
        System.out.println();

        System.out.println("=== Display the total number of contacts. ===");
        System.out.println("Total Contacts : " + directory.size());
        System.out.println();

        System.out.println("===Clear the directory ===");
        directory.clear();
        System.out.println("Directory Cleared");
        System.out.println("Total Contacts : " + directory.size());

    }
}
