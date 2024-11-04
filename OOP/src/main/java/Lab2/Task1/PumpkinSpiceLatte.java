package Lab2.Task1;

public class PumpkinSpiceLatte extends Cappuccino{
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(String name, Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(name, coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public String toString() {
        return super.toString() +
                "mgOfPumpkinSpice = " + mgOfPumpkinSpice;
    }
}
