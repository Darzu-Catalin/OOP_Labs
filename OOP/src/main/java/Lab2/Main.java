package Lab2;

import Lab2.Class.*;


public class Main {

    public static void main(String[] args) {

        SyrupCappuccino c1 = new SyrupCappuccino(Intensity.STRONG, 100, SyrupType.COCONUT);
        Cappuccino c2 = new Cappuccino(Intensity.NORMAL, 100);
        c2.printCoffeeDetails();
        c1.printCoffeeDetails();

    }

}
