package Lab2.Class;

public class Americano extends Coffee {
    private int mlOfWater;


    public Americano(String name, Intensity coffeeIntensity, int mlOfWater) {
        super("Americano", coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

    public void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Quantity of water: " + mlOfWater + " ml");
    }

    @Override
    public String toString() {
        return super.toString() +
                "mlOfWater = " + mlOfWater;
    }
}
