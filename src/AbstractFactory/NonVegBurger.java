package AbstractFactory;

public class NonVegBurger implements Burger{

    @Override
    public void getBurger()
    {
        System.out.println("Serving you Non-Veg Burger");
    }
}
