package GenericClass.MultipleTypeParameterExample;

class Employee<T,U>
{
    private T employeeId;
    private U employeeName;

    public Employee(T employeeId,U employeeName)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void display()
    {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}