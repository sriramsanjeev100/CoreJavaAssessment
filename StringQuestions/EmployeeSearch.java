package StringQuestions;

import java.util.Scanner;

public class EmployeeSearch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Minimum Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Minimum Experience: ");
        int experience = sc.nextInt();

        StringBuilder query = new StringBuilder();
    }
}
