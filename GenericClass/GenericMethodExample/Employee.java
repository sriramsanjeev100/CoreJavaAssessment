package GenericClass.GenericMethodExample;

public class Employee
{
    public <T> void display(T value)
    {
        System.out.println(value);
    }

    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.display(101);
        employee.display("Sriram");
        employee.display(50000.0);
    }
}