package EnumArrayBasics;

enum Product
{
    LAPTOP(55000),
    MOUSE(800),
    KEYBOARD(1500),
    MONITOR(12000);

    int price;

    Product(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
}

public class ProductDemo
{
    public static void main(String[] args)
    {
        for (Product p : Product.values())
        {
            System.out.println(p + " ===> " + p.getPrice());
        }

    }
}
