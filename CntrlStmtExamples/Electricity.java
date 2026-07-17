package CntrlStmtExamples;

import java.util.Scanner;

public class Electricity
{
    public static void main(String args[])
    {
        int ch;
        double bill=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Units Consumed : ");
        double units=sc.nextDouble();

        System.out.println("Customer Type");
        System.out.println("1. Domestic ");
        System.out.println("2. Commercial ");
        System.out.println("Enter Customer Type : ");
        ch=sc.nextInt();

        switch(ch)
        {
            case 1:
                if (units<100)
                {
                    bill=units*2;
                }
                else
                {
                    bill=(100*2)+((units-100)*5);
                }
                break;

            case 2:
                if (units<100)
                {
                    bill=units*4;
                }
                else
                {
                    bill=(100*4)+((units-100)*7);
                }
                break;

            default:
                System.out.println("Invalid Input");
                break;
        }

        System.out.println("Electricity Bill Amount: "+bill);

    }
}
