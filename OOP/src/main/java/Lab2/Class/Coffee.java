package Lab2.Class;

class Coffee {
    private Intensity coffeeIntensity;
    private String name;

    public Coffee(String name ,Intensity coffeeIntensity) {
        this.name = name;
        this.coffeeIntensity = coffeeIntensity;
    }

    public Coffee makeCoffee(){
        System.out.println("Starting the coffee-making process for " + name);
        System.out.println("Grinding coffee beans to " + coffeeIntensity + " intensity");
        return this;
    }

    public void printCoffeeDetails() {
        System.out.println("The recipe details for " + name + ":");
        System.out.println("The intensity is set to " + coffeeIntensity);
        System.out.println("Brewing a strong espresso shot");
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
