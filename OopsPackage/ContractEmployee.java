package OopsPackage;

class ContractEmployee extends Employee
{
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(int empId, String name, int hoursWorked, double hourlyRate, Address address)
    {
        super(empId, name, address);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked()
    {
        return hoursWorked;
    }
    public double getHourlyRate()
    {
        return hourlyRate;
    }

    @Override
    public double calculateSalary()
    {
        return hoursWorked * hourlyRate;
    }
}