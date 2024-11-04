package Lab2.Task1;

public class Cappuccino extends Coffee {
    private int mlOfMilk;

    public Cappuccino(String name, Intensity coffeeIntensity, int mlOfMilk) {
        super(name, coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public String toString() {
        return super.toString() +
                "mlOfMilk = " + mlOfMilk;
    }
}
