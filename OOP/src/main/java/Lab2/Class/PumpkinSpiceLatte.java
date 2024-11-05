package Lab2.Class;

class PumpkinSpiceLatte extends Cappuccino{
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super("Pumpkin Spice Latte", coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public final PumpkinSpiceLatte makePumpkinSpiceLatte() {
        makeCoffeeBase();
        System.out.println("Steaming " + getMlOfMilk() + " ml of milk with " + mgOfPumpkinSpice + "mg of pumpkin spice");
        System.out.println("Pouring spiced milk into the espresso and topping with foam");
        return this;
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
