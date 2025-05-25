package AbstractFactory;

public class VegPizza implements Pizza{

    @Override
    public void getPizza()
    {
        System.out.println("Serving you Veg Pizza");
    }
}
