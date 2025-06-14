package Decorator;

abstract public class CoffeeDecorator implements Coffee{

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee)
    {
        this.coffee=coffee;
    }

    @Override
    public int cost()
    {
        return coffee.cost();
    }

    @Override
    public String getDescription()
    {
        return coffee.getDescription();
    }


}
