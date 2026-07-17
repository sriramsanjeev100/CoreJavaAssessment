package OopsPackage;

class Manager extends PermanentEmployee
{
    private Department department;

    public Manager(int empId, String name, double salary, double bonus, Address address, Department department)
    {
        super(empId, name, salary, address, bonus);
        this.department = department;
    }
    public Department getDepartment()
    {
        return department;
    }
}