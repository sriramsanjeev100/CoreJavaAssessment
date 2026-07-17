package EnumArrayBasics;

import java.util.Scanner;

public class Rating
{
    enum customerRating
    {
        EXCELLENT,
        GOOD,
        AVERAGE,
        POOR
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        customerRating[] ratings = new customerRating[10];

        int excellent = 0;
        int good = 0;
        int average = 0;
        int poor = 0;

        for(int i = 0; i < ratings.length; i++)
        {
            System.out.println("Enter rating for Customer " + (i + 1));
            System.out.println("1. EXCELLENT");
            System.out.println("2. GOOD");
            System.out.println("3. AVERAGE");
            System.out.println("4. POOR");

            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    ratings[i]=customerRating.EXCELLENT;
                    excellent++;
                    break;

                case 2:
                    ratings[i]=customerRating.GOOD;
                    good++;
                    break;

                case 3:
                    ratings[i]=customerRating.AVERAGE;
                    average++;
                    break;

                case 4:
                    ratings[i]=customerRating.POOR;
                    poor++;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        System.out.println("\nCustomer Ratings:");
        for (int i = 0; i < ratings.length; i++)
        {
            System.out.println("Customer " + (i + 1) + " : " + ratings[i]);
        }

        System.out.println("\nNumber of EXCELLENT Ratings : " + excellent);
        System.out.println("Number of GOOD Ratings      : " + good);
        System.out.println("Number of AVERAGE Ratings   : " + average);
        System.out.println("Number of POOR Ratings      : " + poor);

        int max = excellent;
        customerRating mostCommon = customerRating.EXCELLENT;

        if (good > max)
        {
            max = good;
            mostCommon = customerRating.GOOD;
        }

        if (average > max)
        {
            max = average;
            mostCommon = customerRating.AVERAGE;
        }

        if (poor > max)
        {
            max = poor;
            mostCommon = customerRating.POOR;
        }

        System.out.println("\nMost Common Rating : " + mostCommon);

        double percentage = excellent * 10.0;
        System.out.printf("Percentage of EXCELLENT Ratings : %.2f%%", percentage);

        sc.close();
    }
}
