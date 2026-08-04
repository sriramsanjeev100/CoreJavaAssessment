package DesignPatterns.Decorator.Employee;

public class InsuranceDecorator extends EmployeeDecorator
{
    public InsuranceDecorator(Employee employee)
    {
        super(employee);
    }

    @Override
    public String getDetails()
    {
        return employee.getDetails() + ", Health Insurance";
    }

    @Override
    public double getSalary()
    {
        return employee.getSalary() + 5000;
    }
}