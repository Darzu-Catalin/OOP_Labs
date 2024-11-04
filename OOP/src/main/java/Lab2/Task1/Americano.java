package Lab2.Task1;

public class Americano extends Coffee {
    private int mlOfWater;


    public Americano(String name, Intensity coffeeIntensity, int mlOfWater) {
        super(name, coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }

    @Override
    public String toString() {
        return super.toString() +
                "mlOfWater = " + mlOfWater;
    }
}
