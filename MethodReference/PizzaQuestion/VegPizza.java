package MethodReference.PizzaQuestion;

public class VegPizza implements Pizza
{
    public VegPizza()
    {
        System.out.println("Veg Pizza Object Created");
    }
    @Override
    public void prepare()
    {
        System.out.println("Preparing Pizza");
    }
}
