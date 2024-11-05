package Lab2.Class;

class Americano extends Coffee {
    private int mlOfWater;

    public Americano(Intensity coffeeIntensity, int mlOfWater) {
        super("Americano", coffeeIntensity);
        this.mlOfWater = mlOfWater;
    }


    public final Americano makeAmericano(){
        makeCoffeeBase();
        System.out.println("Brewing a concentrated espresso shot");
        System.out.println("Adding " + mlOfWater + "ml of hot water to dilute the espresso");
        return this;
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
