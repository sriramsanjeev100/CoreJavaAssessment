package OopsPackage;

class PermanentEmployee extends Employee
{
    private double bonus;

    public PermanentEmployee(int empId, String name, double salary, Address address, double bonus)
    {
        super(empId, name, salary, address);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary()
    {
        return getSalary() + bonus;
    }
}
