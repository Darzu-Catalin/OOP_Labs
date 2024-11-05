package Lab2.Class;

public class Cappuccino extends Coffee {
    private int mlOfMilk;

    public Cappuccino(String name, Intensity coffeeIntensity, int mlOfMilk) {
        super(name, coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super("Cappuccino", coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public final Cappuccino makeCappuccino(){
        makeCoffeeBase();
        System.out.println("Steaming " + mlOfMilk + " ml of milk to a velvety texture");
        System.out.println("Pouring steamed milk into espresso and topping with foam");
        return this;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();;
        System.out.println("Quantity of milk: " + mlOfMilk);
    }

    @Override
    public String toString() {
        return super.toString() +
                "mlOfMilk = " + mlOfMilk;
    }
}
