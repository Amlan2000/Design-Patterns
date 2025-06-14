package Decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee)
    {
        super(coffee);
    }

    @Override
    public int cost()
    {
        return super.cost() + 20;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription() + " ,Sugar";
    }
}
