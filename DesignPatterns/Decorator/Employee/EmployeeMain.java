package DesignPatterns.Decorator.Employee;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        Employee employee = new BasicEmployee("Sriram", 50000);
        employee = new BonusDecorator(employee);
        employee = new InsuranceDecorator(employee);
        employee = new TransportDecorator(employee);
        employee = new MealCouponDecorator(employee);

        System.out.println();
        System.out.println("===== Employee Details =====");
        System.out.println();
        System.out.println(employee.getDetails());
        System.out.println("Final Salary : Rs." + employee.getSalary());
    }
}