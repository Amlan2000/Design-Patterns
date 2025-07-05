import Builder.Car;

public class BuilderMain {

    public static void main(String[] args)
    {
        Car car1 = new Car.Builder("Toyota").build();
        car1.getCar();

        Car car2 = new Car.Builder("Ferrari").setColor("Red").setModel("458").build();
        car2.getCar();

    }
}
