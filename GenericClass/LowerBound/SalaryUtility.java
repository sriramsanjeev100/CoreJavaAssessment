package GenericClass.LowerBound;

import java.util.List;

public class SalaryUtility
{
    public static void addSalary(List<? super Integer> salaries)
    {
        salaries.add(25000);
        salaries.add(30000);
        salaries.add(35000);

        System.out.println("Salary values added successfully.");
    }
}