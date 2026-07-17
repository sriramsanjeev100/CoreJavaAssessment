package CntrlStmtExamples;

import java.util.Scanner;

public class GradingSystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        final int subjects = 5;
        int total = 0;

        for (int i = 1; i <= subjects; i++)
        {
            System.out.print("Enter Marks : ");
            int marks = sc.nextInt();
            total += marks;
        }

        double avg = (double) total / subjects;

        System.out.println("Total Marks is " + total);
        System.out.println("Average Marks is " + avg);

        if (avg >= 90)
            System.out.println("Grade A");
        else if (avg >= 75)
            System.out.println("Grade B");
        else if (avg >= 60)
            System.out.println("Grade C");
        else if (avg >= 40)
            System.out.println("Grade D");
        else
            System.out.println("Fail");

        sc.close();
    }
}