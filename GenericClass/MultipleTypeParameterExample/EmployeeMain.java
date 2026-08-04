package GenericClass.MultipleTypeParameterExample;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        Employee<Integer,String> emp = new Employee<>(101,"Sriram");
        emp.display();
    }
}