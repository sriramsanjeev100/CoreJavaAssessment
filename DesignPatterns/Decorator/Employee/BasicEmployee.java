package DesignPatterns.Decorator.Employee;

public class BasicEmployee implements Employee
{
    private String name;
    private double salary;

    public BasicEmployee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getDetails()
    {
        return "Employee : " + name;
    }

    @Override
    public double getSalary()
    {
        return salary;
    }
}