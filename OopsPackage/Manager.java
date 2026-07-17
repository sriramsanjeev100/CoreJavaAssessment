package OopsPackage;

class Manager extends Employee
{
    private Department department;

    public Manager(int empId, String name, double salary, Address address, Department department)
    {
        super(empId, name, salary, address);
        this.department = department;
    }

    public Department getDepartment()
    {
        return department;
    }
}