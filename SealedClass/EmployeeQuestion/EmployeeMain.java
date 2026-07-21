package SealedClass.EmployeeQuestion;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        Employee e1 = new PermanentEmployee(101,"Sriram",50000,10000);
        Employee e2 = new PermanentEmployee(102,"Leo",40000,12000);
        Employee e3 = new PermanentEmployee(103,"John",45000,9000);

        e1.displayEmployeeDetails();
        System.out.println();
        e2.displayEmployeeDetails();
        System.out.println();
        e3.displayEmployeeDetails();

    }
}
