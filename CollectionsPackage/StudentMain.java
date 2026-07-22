package CollectionsPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student
{
    int id;
    String name;
    String department;
    int marks;

    public Student(int id, String name, String department, int marks)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getMarks()
    {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Department='" + department + '\'' +
                ", Marks=" + marks +
                '}';
    }
}

public class StudentMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        students.add(new Student(1001, "Sriram", "ECE", 78));
        students.add(new Student(1002, "Leo", "CSE", 83));
        students.add(new Student(1003, "Aaron", "EEE", 75));
        students.add(new Student(1004, "John", "CSE", 77));
        students.add(new Student(1005, "Stephen", "ECE", 88));

        System.out.println("=====ALL STUDENTS=====");
        for(Student student : students)
        {
            System.out.println(student);
        }

        Comparator<Student> comp = new Comparator<Student>()
        {
            @Override
            public int compare(Student s1, Student s2)
            {
                return Integer.compare(s1.getMarks(), s2.getMarks());
            }
        };

        students.sort(comp);

        System.out.println("=====SORTED BY MARKS=====");
        for (Student student : students)
        {
            System.out.println(student);
        }

        System.out.print("Enter department to search(CSE/ECE/EEE) : ");
        String dept = sc.next();
        for (Student student : students)
        {
            if (student.getDepartment().equals(dept))
            {
                System.out.println(student);
            }
        }
    }
}
