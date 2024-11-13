package Lab2.Class;

class Cappuccino extends Coffee {
    private int mlOfMilk;

    public Cappuccino(String name, Intensity coffeeIntensity, int mlOfMilk) {
        super(name, coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super("Cappuccino", coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }


    public Cappuccino makeCappuccino(){
        this.makeRecipe();
        return this;
    }

    @Override
    public void makeRecipe(){
        super.makeRecipe();
        System.out.println("Steaming " + mlOfMilk + " ml of milk to a velvety texture");
        System.out.println("Pouring steamed milk into espresso and topping with foam");

    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Quantity of milk: " + mlOfMilk);
    }

    @Override
    public String toString() {
        return super.toString() +
                "mlOfMilk = " + mlOfMilk;
    }
}
