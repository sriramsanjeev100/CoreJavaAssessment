package OopsPackage;

abstract class Employee
{
    private int empId;
    private String name;
    private double salary;
    private Address address;

    public Employee() { }

    public Employee(int empId, String name)
    {
        this.empId = empId;
        this.name = name;
    }

    public Employee(int empId, String name, double salary)
    {
        this(empId, name);
        this.salary = salary;
    }

    public Employee(int empId, String name, Address address) {
        this(empId, name);
        this.address = address;
    }

    public Employee(int empId, String name, double salary, Address address)
    {
        this(empId,name,salary);
        this.address = address;
    }

    public int getEmpId()
    {
        return empId;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Address getAddress()
    {
        return address;
    }

    public void workOnProject(Project project)
    {
        System.out.println("Employee is working on the following project : ");
        project.displayProjectDetails();
    }

    public abstract double calculateSalary();
}
