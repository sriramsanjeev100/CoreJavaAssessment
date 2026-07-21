package SealedClass.EmployeeQuestion;

public final class InternEmployee extends Employee
{
    double bonus;

    public InternEmployee(int employeeId, String employeeName, double salary, double bonus)
    {
        super(employeeId, employeeName, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary()
    {
        return salary + bonus;
    }

    @Override
    public void displayEmployeeDetails()
    {
        super.displayEmployeeDetails();
        System.out.println("Bonus : Rs." + bonus);
        System.out.println("Total Salary : Rs." + calculateSalary());
    }
}
