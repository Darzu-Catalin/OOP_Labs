package Lab3.CarService;

import Lab3.Dinner.Dineable;
import Lab3.Dinner.PeopleDinner;
import Lab3.Dinner.RobotDinner;
import Lab3.FuelStation.ElectricStation;
import Lab3.FuelStation.GasStation;
import Lab3.FuelStation.Refuelable;
import Lab3.Queue.LinkedQueue;
import Lab3.Queue.Queue;

public class CarStation {
    private final Dineable peopleDiningService;
    private final Dineable robotDiningService;
    private final Refuelable electricRefuelingService;
    private final Refuelable gasRefuelingService;
    private final LinkedQueue<Car> queue;

    // Counters
    private int gasCars = 0;
    private int electricCars = 0;
    private int people = 0;
    private int robots = 0;
    private int dining = 0;
    private int notDining = 0;
    private int consumptionGas = 0;
    private int consumptionElectric = 0;

    public CarStation() {
        this.peopleDiningService = new PeopleDinner();
        this.robotDiningService = new RobotDinner();
        this.electricRefuelingService = new ElectricStation();
        this.gasRefuelingService = new GasStation();
        this.queue = new LinkedQueue<>();
    }

    public void addCar(Car car) {
        queue.enqueue(car);
        System.out.println("Car with the ID " + car.getCarID() + " added to the queue.");
    }

    public void serveCars() {
        printSeparator();
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();

            // Refuel the car based on its fuel type
            if ("GAS".equalsIgnoreCase(car.getFuelType())) {
                gasCars++;
                consumptionGas += car.getConsumption();
                gasRefuelingService.refuel(car.getCarID());
            } else if ("ELECTRIC".equalsIgnoreCase(car.getFuelType())) {
                electricCars++;
                consumptionElectric += car.getConsumption();
                electricRefuelingService.refuel(car.getCarID());
            }

            // Serve dinner if needed
            handleDining(car);
        }

        // Print summary after serving all cars
        printSummary();
        printSeparator();
    }

    public void handleDining(Car car) {
        if (car.needsDinner()) {
            dining++;
            if ("people".equalsIgnoreCase(car.getPassangerType())) {
                peopleDiningService.serveDinner(car.getCarID());
                people++;
            } else if ("robots".equalsIgnoreCase(car.getPassangerType())) {
                robotDiningService.serveDinner(car.getCarID());
                robots++;
            }
        } else {
            notDining++;
            if ("people".equalsIgnoreCase(car.getPassangerType())) {
                people++;
            } else if ("robots".equalsIgnoreCase(car.getPassangerType())) {
                robots++;
            }
        }
    }

    public void printSummary() {
        System.out.println("All cars have been served.\n" +
                "Gas cars: " + gasCars + "\n" +
                "Electric cars: " + electricCars + "\n" +
                "People served: " + people + "\n" +
                "Robots served: " + robots + "\n" +
                "Dining cars: " + dining + "\n" +
                "Not dining cars: " + notDining + "\n" +
                "Consumption (Gas): " + consumptionGas + "\n" +
                "Consumption (Electric): " + consumptionElectric);
    }

    public Queue<Car> getQueue() {
        return this.queue;
    }

    public int getGasCars() {
        return gasCars;
    }

    public int getElectricCars() {
        return electricCars;
    }



    private void printSeparator() {
        System.out.println("-----------------------------------------------------");
    }
}
