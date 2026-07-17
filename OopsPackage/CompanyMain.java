package OopsPackage;

public class CompanyMain
{
    public static void main(String[] args)
    {
        Address address = new Address("Trivandrum", "Kerala", 695006);

        Department department = new Department(101, "Human Resources");

        Manager manager = new Manager(1001,"Rahul",45000,address,department);

        Project project = new Project(201, "Company Management System");

        System.out.println("Employee ID : " + manager.getEmpId());
        System.out.println("Employee Name : " + manager.getName());
        System.out.println("Employee Salary : " + manager.getSalary());

        System.out.println("City : " + manager.getAddress().getCity());
        System.out.println("State : " + manager.getAddress().getState());
        System.out.println("Pincode : " + manager.getAddress().getPincode());

        System.out.println("Department ID : " + manager.getDepartment().getDepartmentId());
        System.out.println("Department Name : " + manager.getDepartment().getDepartmentName());

        manager.workOnProject(project);
    }
}
