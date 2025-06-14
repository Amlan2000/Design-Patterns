import Decorator.BasicCoffee;
import Decorator.Coffee;
import Decorator.MilkDecorator;
import Decorator.SugarDecorator;

public class DecoratorMain {

    public static void main (String[] args)
    {
        System.out.println("Hello and welcome to Decorator Main!\n");

        Coffee coffee = new BasicCoffee();
        coffee= new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.cost());

    }
}
