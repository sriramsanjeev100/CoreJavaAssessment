package OopsPackage;

class PermanentEmployee extends Employee implements TaxPayable
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

    @Override
    public double calculateTax() {
        return calculateSalary() * 0.12;
    }
}
