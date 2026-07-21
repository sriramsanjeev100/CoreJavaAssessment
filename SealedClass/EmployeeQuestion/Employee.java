package SealedClass.EmployeeQuestion;

public sealed abstract class Employee permits PermanentEmployee, ContractEmployee, InternEmployee
{
    int employeeId;
    String employeeName;
    double salary;

    public Employee(int employeeId, String employeeName, double salary)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployeeDetails()
    {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + salary);
    }

    public abstract double calculateSalary();
}
