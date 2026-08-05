package GenericClass.StudentManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMain
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();

        students.add(new Student(101,"Sriram",85));
        students.add(new Student(102,"Leo",80));
        students.add(new Student(103,"John",78));

        StudentUtility.displayStudents(students);

        List<Integer> marks = new ArrayList<>(Arrays.asList(85,80,78));
        StudentUtility.calculateAverage(marks);
        StudentUtility.addBonusMarks(marks);

        System.out.println("Updated Marks : " + marks);
    }
}