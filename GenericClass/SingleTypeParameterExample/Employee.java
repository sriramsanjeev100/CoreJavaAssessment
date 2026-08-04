package GenericClass.SingleTypeParameterExample;

class Employee<T>
{
    private T employeeId;
    public Employee(T employeeId)
    {
        this.employeeId = employeeId;
    }

    public void display()
    {
        System.out.println("Employee ID : " + employeeId);
    }
}