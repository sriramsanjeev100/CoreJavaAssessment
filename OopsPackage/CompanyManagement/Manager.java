package OopsPackage.CompanyManagement;

import OopsPackage.CompanyManagement.Address;
import OopsPackage.CompanyManagement.Department;

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