package OopsPackage.CompanyManagement;

import OopsPackage.CompanyManagement.Address;

public class CompanyMain
{
    public static void main(String[] args)
    {
        Address address = new Address("Trivandrum", "Kerala", 695006);

        Department department = new Department(101, "Human Resources");

        Manager manager = new Manager(1001,"Rahul",50000,10000,address,department);

        ContractEmployee contract = new ContractEmployee(1002,"Sriram",160,200,address);

        Project project = new Project(201, "Company Management System");

        System.out.println("Manager Details");
        System.out.println("Employee ID : " + manager.getEmpId());
        System.out.println("Employee Name : " + manager.getName());
        System.out.println("Basic Salary : " + manager.getSalary());

        System.out.println("City : " + manager.getAddress().getCity());
        System.out.println("State : " + manager.getAddress().getState());
        System.out.println("Pincode : " + manager.getAddress().getPincode());

        System.out.println("Department ID : " + manager.getDepartment().getDepartmentId());
        System.out.println("Department Name : " + manager.getDepartment().getDepartmentName());

        manager.workOnProject(project);
        System.out.println("Total Salary : " + manager.calculateSalary());
        System.out.println("Tax : " + manager.calculateTax());
        System.out.println();

        System.out.println("Contract Employee Details");
        System.out.println("Employee ID : " + contract.getEmpId());
        System.out.println("Employee Name : " + contract.getName());
        System.out.println("Hours Worked : " + contract.getHoursWorked());
        System.out.println("Hourly Rate : " + contract.getHourlyRate());
        System.out.println("Contract Employee Salary : " + contract.calculateSalary());
    }
}
