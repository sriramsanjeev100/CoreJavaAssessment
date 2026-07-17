//Write a Java program that:
//        Accepts marks of 5 subjects (integers).
//        Calculates the total marks.
//        Calculates the percentage as a decimal.
//        Display the percentage up to 2 decimal places.

package Assessment1;

import java.util.Scanner;

public class Marklist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mark 1 : ");
        int mark1=sc.nextInt();
        System.out.println("Enter Mark 2 : ");
        int mark2=sc.nextInt();
        System.out.println("Enter Mark 3 : ");
        int mark3=sc.nextInt();
        System.out.println("Enter Mark 4 : ");
        int mark4=sc.nextInt();
        System.out.println("Enter Mark 5 : ");
        int mark5=sc.nextInt();

        int total_marks=mark1+mark2+mark3+mark4+mark5;
        System.out.println("Total Marks : "+total_marks);

        double percentage=total_marks/5;
        System.out.println("Percentage : "+percentage+"%");
        System.out.printf("Percentage : %.2f%%", percentage);
    }
}
