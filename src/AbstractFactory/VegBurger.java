package AbstractFactory;

public class VegBurger implements Burger{

    @Override
    public void getBurger()
    {
        System.out.println("Serving you Veg Burger");
    }
}
