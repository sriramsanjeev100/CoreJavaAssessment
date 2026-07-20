package MethodReference.PizzaQuestion;

public class ChickenPizza implements Pizza
{
    public ChickenPizza()
    {
        System.out.println("Chicken Pizza object created");
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing Pizza");
    }
}
