//1.A customer purchases:
//Laptop = ₹58,999
//Mouse = ₹799
//        Keyboard = ₹1,499
//Calculate:
//Total amount
//GST (18%)
//Final bill
//Display the final amount as an integer using type casting.

package Assessment1;

public class Billing
{
    public static void main(String[] args)
    {
        int laptop = 58999;
        int mouse = 799;
        int keyboard = 1499;

        int total = laptop + mouse + keyboard;
        System.out.println("Total Bill Amount : Rs. " + total);

        double gst = total * 0.18;
        System.out.println("GST : Rs. " + gst);

        double finalBill = total + gst;
        System.out.println("Final Bill Amount : Rs. " + finalBill);

        int final_amount = (int) finalBill;
        System.out.println("Final Bill Amount (Integer) : Rs. " + final_amount);
    }
}