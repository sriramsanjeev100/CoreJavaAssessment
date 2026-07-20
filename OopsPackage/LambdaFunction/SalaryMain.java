package OopsPackage.LambdaFunction;

public class SalaryMain
{
    public static void main(String[] args)
    {
        double basicSalary=50000;

        SalaryCalculator seniorDeveloper = salary -> salary+(salary*0.2);
        SalaryCalculator manager = salary -> salary+(salary*0.35);
        SalaryCalculator juniorIntern = salary -> salary+(salary*0.05);

        System.out.println("Senior Developer Salary : Rs. " + seniorDeveloper.calculateSalary(basicSalary));
        System.out.println("Manager Salary : Rs. " + manager.calculateSalary(basicSalary));
        System.out.println("Junior Intern Salary : Rs. " + juniorIntern.calculateSalary(basicSalary));
    }
}
