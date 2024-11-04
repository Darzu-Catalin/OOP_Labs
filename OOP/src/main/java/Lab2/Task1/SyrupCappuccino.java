package Lab2.Task1;

public class SyrupCappuccino extends Cappuccino {
    private SyrupType syrup;

    public SyrupCappuccino(String name, Intensity coffeeIntensity, int mlOfMilk SyrupType syrup) {
        super(name, coffeeIntensity, mlOfMilk);
        this.syrup = syrup;
    }

    public String toString() {
        return super.toString() +
                "syrup = " + syrup;
    }
}
