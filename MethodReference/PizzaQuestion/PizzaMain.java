package MethodReference.PizzaQuestion;

public class PizzaMain
{
    public static void main(String[] args)
    {
        PizzaFactory vegFactory = VegPizza::new;
        Pizza veg = vegFactory.createPizza();
        veg.prepare();

        PizzaFactory chickenFactory = ChickenPizza::new;
        Pizza chicken = chickenFactory.createPizza();
        chicken.prepare();
    }
}
