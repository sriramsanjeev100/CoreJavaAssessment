package DesignPatterns.Decorator.Employee;

public class TransportDecorator extends EmployeeDecorator
{
    public TransportDecorator(Employee employee)
    {
        super(employee);
    }

    @Override
    public String getDetails()
    {
        return employee.getDetails() + ", Transport Allowance";
    }

    @Override
    public double getSalary()
    {
        return employee.getSalary() + 3000;
    }
}