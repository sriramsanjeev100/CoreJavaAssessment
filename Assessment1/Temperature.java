//3.Read temperature in Celsius (double).
//        Convert it to Fahrenheit
//        Display:
//        Exact value
//        Rounded integer value

package Assessment1;

import java.util.Scanner;

public class Temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius : ");
        double c = sc.nextDouble();

        double f = ((9*c)/5)+32;
        System.out.println("Temperature in Fahrenheit : "+f);

        long rounded_value = Math.round(f);
        System.out.println("Temperature in Fahrenheit (Rounded Value) : "+rounded_value);

    }
}
