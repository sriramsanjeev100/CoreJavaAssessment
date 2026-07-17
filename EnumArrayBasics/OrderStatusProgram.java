package EnumArrayBasics;

import java.util.Scanner;

enum OrderStatus
{
    PLACED,
    PREPARING,
    OUT_FOR_DELIVERY,
    DELIVERED,
    CANCELLED
}

public class OrderStatusProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OrderStatus[] orders = new OrderStatus[5];

        int placed = 0;
        int preparing = 0;
        int outForDelivery = 0;
        int delivered = 0;
        int cancelled = 0;

        for (int i = 0; i < orders.length; i++) {
            System.out.println("\nEnter status for Order " + (i + 1));
            System.out.println("1. PLACED");
            System.out.println("2. PREPARING");
            System.out.println("3. OUT_FOR_DELIVERY");
            System.out.println("4. DELIVERED");
            System.out.println("5. CANCELLED");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    orders[i] = OrderStatus.PLACED;
                    placed++;
                    break;

                case 2:
                    orders[i] = OrderStatus.PREPARING;
                    preparing++;
                    break;

                case 3:
                    orders[i] = OrderStatus.OUT_FOR_DELIVERY;
                    outForDelivery++;
                    break;

                case 4:
                    orders[i] = OrderStatus.DELIVERED;
                    delivered++;
                    break;

                case 5:
                    orders[i] = OrderStatus.CANCELLED;
                    cancelled++;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        System.out.println("\nOrder Status Count");
        System.out.println("PLACED : " + placed);
        System.out.println("PREPARING : " + preparing);
        System.out.println("OUT_FOR_DELIVERY : " + outForDelivery);
        System.out.println("DELIVERED : " + delivered);
        System.out.println("CANCELLED : " + cancelled);

        int max = placed;
        OrderStatus common = OrderStatus.PLACED;

        if (preparing > max)
        {
            max = preparing;
            common = OrderStatus.PREPARING;
        }

        if (outForDelivery > max)
        {
            max = outForDelivery;
            common = OrderStatus.OUT_FOR_DELIVERY;
        }

        if (delivered > max)
        {
            max = delivered;
            common = OrderStatus.DELIVERED;
        }

        if (cancelled > max)
        {
            max = cancelled;
            common = OrderStatus.CANCELLED;
        }

        System.out.println("\nMost Common Status : " + common);

        System.out.println("\nAvailable Statuses");
        for (OrderStatus status : OrderStatus.values())
        {
            System.out.println(status);
        }

        System.out.println("\nEnter a status: ");
        String input = sc.next();

        OrderStatus status = OrderStatus.valueOf(input);

        System.out.println("Name : " + status.name());
        System.out.println("Ordinal : " + status.ordinal());

        int result = status.compareTo(OrderStatus.DELIVERED);

        System.out.println("compareTo(DELIVERED) : " + result);

        if (result == 0)
        {
            System.out.println("Entered status is DELIVERED.");
        }
        else if (result < 0)
        {
            System.out.println("Entered status comes before DELIVERED.");
        }
        else
        {
            System.out.println("Entered status comes after DELIVERED.");
        }

        System.out.println("\nCompleted Orders");

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] == OrderStatus.DELIVERED)
            {
                System.out.println("Order " + (i + 1) + " is DELIVERED");
            }
        }

        sc.close();
    }
}