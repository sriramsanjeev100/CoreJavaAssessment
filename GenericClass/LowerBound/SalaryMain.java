package GenericClass.LowerBound;

import java.util.ArrayList;
import java.util.List;

public class SalaryMain
{
    public static void main(String[] args)
    {
        List<Integer> integerSalary = new ArrayList<>();
        List<Number> numberSalary = new ArrayList<>();
        List<Object> objectSalary = new ArrayList<>();

        SalaryUtility.addSalary(integerSalary);
        SalaryUtility.addSalary(numberSalary);
        SalaryUtility.addSalary(objectSalary);

        System.out.println();
        System.out.println("Integer List : " + integerSalary);
        System.out.println("Number List : " + numberSalary);
        System.out.println("Object List : " + objectSalary);
    }
}