package StreamAPI.EmployeeStream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain
{
    public static void main(String[] args)
    {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Sriram", 23, "Male", "IT", 2023, 50000),
                new Employee(102, "Leo", 24, "Male", "HR", 2022, 45000),
                new Employee(103, "Aaron", 28, "Male", "Finance", 2020, 65000),
                new Employee(104, "Archa", 26, "Female", "IT", 2021, 70000),
                new Employee(105, "John", 30, "Male", "Sales", 2019, 55000),
                new Employee(106, "Stephy", 22, "Female", "HR", 2024, 40000),
                new Employee(107, "Abhishek", 25, "Male", "Finance", 2023, 48000),
                new Employee(108, "Bharath", 27, "Female", "Sales", 2020, 60000)
        );

        System.out.println("===== Department Names =====");
        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("===== Average Age =====");
        Map<String, Double> averageAge =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getGender,
                                Collectors.averagingInt(Employee::getAge)
                        ));

        averageAge.forEach((gender, age) ->
                System.out.println(gender + " : " + age));
        System.out.println();

        System.out.println("===== Highest Paid Employee =====");
        Employee highestPaid =
                employees.stream()
                        .max(Comparator.comparing(Employee::getSalary))
                        .get();

        System.out.println(highestPaid);
        System.out.println();

        System.out.println("===== Employee Count in each Department =====");

        Map<String, Long> departmentCount =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.counting()
                        ));

        departmentCount.forEach((department, count) ->
                System.out.println(department + " : " + count));
        System.out.println();

        System.out.println("===== Separate Employees based on Age =====");

        Map<Boolean, List<Employee>> partition =
                employees.stream()
                        .collect(Collectors.partitioningBy(
                                employee -> employee.getAge() <= 25
                        ));

        System.out.println("Age <= 25");
        partition.get(true)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Age > 25");
        partition.get(false)
                .forEach(System.out::println);
    }
}
