package Lab2.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barista {
    private final List<String> orders = new ArrayList<>();

    public void printMenu() {
        printSeparator();
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Make an order:");
        System.out.println("1. Coffee");
        System.out.println("2. Americano");
        System.out.println("3. Cappuccino");
        System.out.println("4. Syrup Cappuccino");
        System.out.println("5. Pumpkin Spice Latte");
        System.out.println("6. Finish Order");
        System.out.println("7. Exit");
        printSeparator();
    }

    public void getCoffeeRequest() {
        while (true) {
            printMenu();
            int choice = getValidatedIntegerInput("Enter your choice (1-7):", 1, 7);

            switch (choice) {
                case 1 -> orders.add("Coffee");
                case 2 -> orders.add("Americano");
                case 3 -> orders.add("Cappuccino");
                case 4 -> orders.add("Syrup Cappuccino");
                case 5 -> orders.add("Pumpkin Spice Latte");
                case 6 -> makeOrder(orders);
                case 7 -> {
                    System.out.println("Goodbye! Thanks for visiting us.");
                    printSeparator();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void makeOrder(List<String> orders) {
        for (String order : orders){
            switch (order) {
                case "Coffee" -> handleCoffeeChoice("Coffee");
                case "Americano" -> handleCoffeeChoice("Americano");
                case "Cappuccino" -> handleCoffeeChoice("Cappuccino");
                case "Syrup Cappuccino" -> handleCoffeeChoice("Syrup Cappuccino");
                case "Pumpkin Spice Latte" -> handleCoffeeChoice("Pumpkin Spice Latte");
                default -> System.out.println("Something went wrong. Please try again.");
            }
        }
    }

    public void handleCoffeeChoice(String coffeeType) {
        printSeparator();
        System.out.println("Would you like the Barista recommendation for " + coffeeType +" or customize it yourself?");
        System.out.println("1. Barista Recommendation");
        System.out.println("2. Customize");
        printSeparator();

        int choice = getValidatedIntegerInput("Enter your choice: ", 1, 2);
        printSeparator();
        if (choice == 1) {
            System.out.println("Barista Recommendation for " + coffeeType + ":");
            getBaristaRecommendation(coffeeType);

        } else {
            System.out.println("Customize your " + coffeeType + ":");
            getCustomCoffee(coffeeType);
        }

    }

    private void getBaristaRecommendation(String coffeeType) {
        printSeparator();
        switch (coffeeType) {
            case "Coffee" -> {
                Coffee coffee = new Coffee("Coffee",Intensity.NORMAL);
                coffee.printCoffeeDetails();
                printSeparator();
                coffee.makeCoffeeBase();
            }
            case "Americano" -> {
               Americano americano = new Americano(Intensity.NORMAL, 150);
               americano.printCoffeeDetails();
                printSeparator();
               americano.makeAmericano();
            }
            case "Cappuccino" -> {
                Cappuccino cappuccino = new Cappuccino(Intensity.NORMAL, 150);
                cappuccino.printCoffeeDetails();
                printSeparator();
                cappuccino.makeCappuccino();
            }
            case "Syrup Cappuccino" -> {
                SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.NORMAL, 150, SyrupType.COCONUT);
                syrupCappuccino.printCoffeeDetails();
                printSeparator();
                syrupCappuccino.makeSyrupCappuccino();
            }
            case "Pumpkin Spice Latte" ->{
                PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.NORMAL, 150, 10);
                pumpkinSpiceLatte.printCoffeeDetails();
                printSeparator();
                pumpkinSpiceLatte.makePumpkinSpiceLatte();
            }
            default -> throw new IllegalArgumentException("Unknown coffee type: " + coffeeType);
        }

    }

    private void getCustomCoffee(String coffeeType) {
        Intensity intensity = getIntensity();
        int mlOfWater = 0;
        int mlOfMilk = 0;
        int mgOfSpice = 0;
        SyrupType syrup = null;
        printSeparator();
        switch (coffeeType) {
            case "Coffee" -> {
                Coffee coffee = new Coffee("Coffee",intensity);
                coffee.printCoffeeDetails();
                printSeparator();
                coffee.makeCoffeeBase();
            }
            case "Americano" -> {
                mlOfWater = getValidatedIntegerInput("Enter ml of water: ", 50, 300);
                Americano americano = new Americano(intensity, mlOfWater);
                printSeparator();
                americano.printCoffeeDetails();
                printSeparator();
                americano.makeAmericano();
            }
            case "Cappuccino" -> {
                mlOfMilk = getValidatedIntegerInput("Enter ml of milk: ", 50, 200);
                Cappuccino cappuccino = new Cappuccino(intensity, mlOfMilk);
                printSeparator();
                cappuccino.printCoffeeDetails();
                printSeparator();
                cappuccino.makeCappuccino();
            }
            case "Syrup Cappuccino" -> {
                mlOfMilk = getValidatedIntegerInput("Enter ml of milk: ", 50, 200);
                printSeparator();
                syrup = getSyrupType();
                printSeparator();
                SyrupCappuccino syrupCappuccino = new SyrupCappuccino(intensity, mlOfMilk, syrup);
                syrupCappuccino.printCoffeeDetails();
                printSeparator();
                syrupCappuccino.makeSyrupCappuccino();
            }
            case "Pumpkin Spice Latte" -> {
                mlOfMilk = getValidatedIntegerInput("Enter ml of milk: ", 50, 200);
                printSeparator();
                mgOfSpice = getValidatedIntegerInput("Enter mg of pumpkin spice: ", 1, 50);
                printSeparator();
                PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(intensity, mlOfMilk, mgOfSpice);
                pumpkinSpiceLatte.printCoffeeDetails();
                printSeparator();
                pumpkinSpiceLatte.makePumpkinSpiceLatte();
            }
            default -> throw new IllegalArgumentException("Unknown coffee type");
        }

    }

    private Intensity getIntensity() {
        System.out.println("Select coffee intensity:");
        System.out.println("1. Light");
        System.out.println("2. Normal");
        System.out.println("3. Strong");
        printSeparator();

        int intensityChoice = getValidatedIntegerInput("Enter intensity: ", 1, 3);
        return switch (intensityChoice) {
            case 1 -> Intensity.LIGHT;
            case 2 -> Intensity.NORMAL;
            case 3 -> Intensity.STRONG;
            default -> throw new IllegalStateException("Unexpected value: " + intensityChoice);
        };
    }

    private SyrupType getSyrupType() {
        System.out.println("Select syrup type:");
        SyrupType[] syrups = SyrupType.values();
        for (int i = 0; i < syrups.length; i++) {
            System.out.println((i + 1) + ". " + syrups[i]);
        }
        printSeparator();

        int syrupChoice = getValidatedIntegerInput("Enter syrup choice: ", 1, syrups.length);
        return syrups[syrupChoice - 1];
    }

    private int getValidatedIntegerInput(String prompt, int minValue, int maxValue) {
        Scanner scanner = new Scanner(System.in);
        int value;

        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= minValue && value <= maxValue) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + minValue + " and " + maxValue + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number!");
                scanner.next(); // Clear invalid input
            }
        }
        return value;
    }


    private void printSeparator() {
        System.out.println("----------------------------------------------------------------");
    }
}
