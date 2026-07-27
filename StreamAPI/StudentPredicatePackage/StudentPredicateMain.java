package StreamAPI.StudentPredicatePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StudentPredicateMain
{
    public static void main(String[] args)
    {
        List<Student> students = Arrays.asList(
                new Student(101,"Sriram","Male","CSE","A+"),
                new Student(102,"Leo","Male","ECE","A"),
                new Student(103,"Anu","Female","CSE","B"),
                new Student(104,"Daniel","Male","EEE","A"),
                new Student(105,"Sona","Female","MECH","C")
                );

        Predicate<Student> girls =
                student -> student.getGender().equalsIgnoreCase("Female");

        Predicate<Student> grades =
                student -> student.getGrade().equalsIgnoreCase("A+")
                        || student.getGrade().equalsIgnoreCase("A")
                        || student.getGrade().equalsIgnoreCase("B");

        System.out.println("===== Girls Students =====");
        students.stream()
                .filter(girls)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("===== Students with Grade A+, A and B =====");
        students.stream()
                .filter(grades)
                .forEach(System.out::println);
    }
}
