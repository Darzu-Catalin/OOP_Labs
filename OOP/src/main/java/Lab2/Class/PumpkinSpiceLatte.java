package Lab2.Class;

class PumpkinSpiceLatte extends Cappuccino{
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity coffeeIntensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super("Pumpkin Spice Latte", coffeeIntensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public PumpkinSpiceLatte makePumpkinSpice() {
        // makePumpkinSpice should not call makeCappuccino
        // but still reuse cappuccino recipe
        //super.makeCappuccino();
        this.makeRecipe();
        return this;
    }

    @Override
    public void makeRecipe() {
        super.makeRecipe();
        System.out.println("Adding "+ mgOfPumpkinSpice + "mg of pumpkin spice");
        System.out.println("Pouring spiced milk into the espresso and topping with foam");
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
