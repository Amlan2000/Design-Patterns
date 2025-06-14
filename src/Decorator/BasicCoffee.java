package Decorator;

public class BasicCoffee implements Coffee{

    @Override
    public int cost()
    {
        return 100;
    }

    @Override
    public String getDescription()
    {
        return "Basic Coffee";
    }
}
