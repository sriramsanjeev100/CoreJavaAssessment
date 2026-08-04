package GenericClass.SingleTypeParameterExample;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        Employee<Integer> emp1 = new Employee<>(101);
        Employee<String> emp2 = new Employee<>("EmpID102");
        emp1.display();
        emp2.display();
    }
}