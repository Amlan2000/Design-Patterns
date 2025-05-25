import AbstractFactory.*;


public class AbstractFactoryMain {

    public static void main(String[] args)
    {
        System.out.printf("Hello and welcome to Abstract actory Main!\n");

        MealFactory mealFactory1 = new VegMealFactory();
        Burger burger1= mealFactory1.getBurger();
        burger1.getBurger();
        Pizza pizza1 = mealFactory1.getPizza();
        pizza1.getPizza();

        MealFactory mealFactory2 = new NonVegMealFactory();
        Burger burger2 = mealFactory2.getBurger();
        burger2.getBurger();
        Pizza pizza2 = mealFactory2.getPizza();
        pizza2.getPizza();

    }
}
