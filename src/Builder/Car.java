package Builder;

public class Car {

    private final String brand;
    private final String color;
    private final String model;

    private Car(Builder builder)
    {
        this.brand=builder.brand;
        this.color=builder.color;
        this.model=builder.model;
    }

    public static class Builder
    {
        private String brand;
        private String color="black";
        private String model="fortuner";

        public Builder(String brand)
        {
            this.brand=brand;
        }

        public Builder setColor(String color)
        {
            this.color=color;
            return this;
        }

        public Builder setModel(String model)
        {
            this.model=model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    public void getCar()
    {
        System.out.println("Brand: "+ brand+" Color: "+color+" model: "+model);
    }
}
