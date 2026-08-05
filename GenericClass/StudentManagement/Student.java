package GenericClass.StudentManagement;

public class Student
{
    private int studentId;
    private String name;
    private int marks;

    public Student(int studentId, String name, int marks)
    {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString()
    {
        return "Student ID : " + studentId + "\nName : " + name + "\nMarks : " + marks;
    }
}