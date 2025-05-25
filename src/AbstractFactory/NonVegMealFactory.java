package AbstractFactory;

public class NonVegMealFactory implements MealFactory{

    public Burger getBurger()
    {
        return new NonVegBurger();
    }

    public Pizza getPizza()
    {
        return new NonVegPizza();
    }
}
