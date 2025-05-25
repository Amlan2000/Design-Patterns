package AbstractFactory;

public class VegMealFactory implements MealFactory{

    public Burger getBurger()
    {
        return new VegBurger();
    }

    public Pizza getPizza()
    {
        return new VegPizza();
    }

}
