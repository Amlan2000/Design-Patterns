package AbstractFactory;

public class NonVegPizza implements Pizza{

    @Override
    public void getPizza()
    {
        System.out.println("Serving you Non-Veg Pizza");
    }
}
