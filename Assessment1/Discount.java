//4.Read:
//Purchase amount
//Customer type (Regular/Premium)
//Rules:
//Premium customers get 20% discount.
//Regular customers get 10% discount.
//If the purchase amount is greater than ₹10,000, apply an additional 5% discount after the first discount.
//        Display:
//Discount amount
//Final amount

package Assessment1;

import java.util.Scanner;

public class Discount
{
    public static void main(String args[])
    {
        double discount;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Purchase amount: ");
        double purchase_amount = sc.nextDouble();

        System.out.print(" Enter type of customer (Regular/Premium) : ");
        String customer_type = sc.next();

        if (customer_type.equalsIgnoreCase("Premium"))
            {
            discount=purchase_amount*0.2;
            }
        else
        {
            discount=purchase_amount*0.1;
        }

        double amount_after_discount = purchase_amount-discount;
        if (purchase_amount > 10000 && (customer_type.equalsIgnoreCase("Premium") || customer_type.equalsIgnoreCase("Regular")))
        {
            double additional_discount=amount_after_discount*0.05;
            discount = discount + additional_discount;
            amount_after_discount = amount_after_discount - additional_discount;
        }

        System.out.println("Discount Amount : Rs. "+ discount);
        System.out.println("Final Amount : Rs. "+ amount_after_discount);

        sc.close();
    }
}
