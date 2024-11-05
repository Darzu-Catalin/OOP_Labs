package Lab2.Class;

public class PumpkinSpiceLatte extends Cappuccino{
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super("Pumpkin Spice Latte", coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }

    public void setMgOfPumpkinSpice(int mgOfPumpkinSpice) {
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Quantity of pumpkin spice: " + mgOfPumpkinSpice + " mg");
    }

    @Override
    public String toString() {
        return super.toString() +
                "mgOfPumpkinSpice = " + mgOfPumpkinSpice;
    }
}
