package DesignPatterns.Decorator.Employee;

public class MealCouponDecorator extends EmployeeDecorator
{
    public MealCouponDecorator(Employee employee)
    {
        super(employee);
    }

    @Override
    public String getDetails()
    {
        return employee.getDetails() + ", Meal Coupon";
    }

    @Override
    public double getSalary()
    {
        return employee.getSalary() + 2000;
    }
}