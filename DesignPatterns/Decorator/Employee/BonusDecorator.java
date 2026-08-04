package DesignPatterns.Decorator.Employee;

public class BonusDecorator extends EmployeeDecorator
{
    public BonusDecorator(Employee employee)
    {
        super(employee);
    }

    @Override
    public String getDetails()
    {
        return employee.getDetails() + ", Performance Bonus";
    }

    @Override
    public double getSalary()
    {
        return employee.getSalary() + 10000;
    }
}