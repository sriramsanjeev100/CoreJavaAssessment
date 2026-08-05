package GenericClass.StudentManagement;

import java.util.List;

public class StudentUtility
{
    public static void displayStudents(List<?> list)
    {
        System.out.println("===== Display List =====");
        for (Object obj : list)
        {
            System.out.println(obj);
            System.out.println();
        }
    }

    public static void calculateAverage(List<? extends Number> marks)
    {
        double total = 0;
        for (Number mark : marks)
        {
            total += mark.doubleValue();
        }

        double average = total / marks.size();
        System.out.println("Average Marks : " + average);
        System.out.println();
    }

    public static void addBonusMarks(List<? super Integer> marks)
    {
        marks.add(5);
        marks.add(7);
        marks.add(8);
        System.out.println("Bonus Marks Added");
    }
}