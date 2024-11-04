package Lab2.Task1;

public class Coffee {
    private Intensity coffeeIntensity;
    private String name;

    public Coffee(String name ,Intensity coffeeIntensity) {
        this.name = name;
        this.coffeeIntensity = coffeeIntensity;
    }

    @Override
    public String toString() {
        return  "Name = '" + name + '\'' +
                "coffeeIntensity = " + coffeeIntensity;
    }
}
