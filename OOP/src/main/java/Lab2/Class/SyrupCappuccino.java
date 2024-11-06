package Lab2.Class;

class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(Intensity coffeeIntensity, int mlOfMilk, SyrupType syrup) {
        super("Syrup Cappuccino", coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }

    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    public SyrupCappuccino makeCoffee() {
        super.makeCoffee();
        System.out.println("Adding " + syrup + " syrup to the cup");
        System.out.println("Steaming " + getMlOfMilk() + "ml of milk and pouring over the espresso");
        System.out.println("Topping with foam and a drizzle of " + syrup + " syrup");
        return this;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Type of syrup: " + syrup);

    }

    @Override
    public String toString() {
        return super.toString() +
                "syrup = " + syrup;
    }
}
