package Lab2.Class;

public class Coffee {
    private Intensity coffeeIntensity;
    private String name;

    public Coffee(String name ,Intensity coffeeIntensity) {
        this.name = name;
        this.coffeeIntensity = coffeeIntensity;
    }

    public void printCoffeeDetails() {
        System.out.println("The recipe details for " + name + ":");
        System.out.println("The intensity is set to " + coffeeIntensity);
    }


    public Intensity getCoffeeIntensity() {
        return coffeeIntensity;
    }

    public void setCoffeeIntensity(Intensity coffeeIntensity) {
        this.coffeeIntensity = coffeeIntensity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Name = '" + name + '\'' +
                "coffeeIntensity = " + coffeeIntensity;
    }
}
