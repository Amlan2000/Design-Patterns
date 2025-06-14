package Decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee)
    {
        super(coffee);
    }

    @Override
    public int cost()
    {
        return super.cost() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ,Milk";
    }
}
