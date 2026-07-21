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
        double minSalary = sc.nextDouble();

        System.out.print("Enter Minimum Experience: ");
        int minExperience = sc.nextInt();

        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM Employee WHERE ");

        if (department != null && !department.isEmpty()) {
            query.append("Department = '").append(department).append("'");
        }

        if (minSalary > 0) {
            query.append(" AND Salary > ").append(minSalary);
        }

        if (minExperience > 0) {
            query.append(" AND Experience > ").append(minExperience);
        }

        System.out.println("Generated SQL Query:");
        System.out.println(query);
    }
}
