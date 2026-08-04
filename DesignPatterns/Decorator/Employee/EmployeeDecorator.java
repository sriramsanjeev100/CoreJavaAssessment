package DesignPatterns.Decorator.Employee;

public abstract class EmployeeDecorator implements Employee
{
    protected Employee employee;
    public EmployeeDecorator(Employee employee)
    {
        this.employee = employee;
    }

    @Override
    public String getDetails()
    {
        return employee.getDetails();
    }

    @Override
    public double getSalary()
    {
        return employee.getSalary();
    }
}