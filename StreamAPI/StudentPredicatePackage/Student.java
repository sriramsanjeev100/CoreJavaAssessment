package StreamAPI.StudentPredicatePackage;

public class Student
{
    private int rollNo;
    private String name;
    private String gender;
    private String studentClass;
    private String grade;

    public Student(int rollNo, String name, String gender, String studentClass, String grade)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.studentClass = studentClass;
        this.grade = grade;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public String getStudentClass()
    {
        return studentClass;
    }

    public String getGrade()
    {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", studentClass='" + studentClass + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
