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
    private final Refuelable gasRefuilingservice;
    private final LinkedQueue<Car> queue;
    private int gasCars = 0;
    private int electricCars = 0;
    private int people = 0;
    private int robots = 0;
    private int dining = 0;
    private int notDining = 0;
    private int consumptionGas = 0;
    private int consumptionElectric = 0;

    public CarStation(){
        this.peopleDiningService = new PeopleDinner();
        this.robotDiningService = new RobotDinner();
        this.electricRefuelingService = new ElectricStation();
        this.gasRefuilingservice = new GasStation();
        this.queue = new LinkedQueue<>();
    }

    public void addCar(Car car) {
        queue.enqueue(car);
        System.out.println("Car with the id " + car.getCarID() + " added to the queue.");
    }

    public void serveElectricCars() {
        print_separator();
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();

            electricRefuelingService.refuel(car.getCarID());
            electricCars += 1;
            consumptionElectric += car.getConsumption();

            dinningService(car);

        }
        print_separator();
        System.out.println("All cars have been served.\n" +
                "Electric cars: " + electricCars + "\n" +
                "People served: " + people + ", Robots served: " + robots + "\n" +
                "Dining cars: " + dining + ", Not dining cars: " + notDining + "\n" +
                "Consumption (electric): " + consumptionElectric);

        print_separator();
    }

    public void serveGasCars() {
        print_separator();
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();

            gasCars += 1;
            consumptionGas += car.getConsumption();
            gasRefuilingservice.refuel(car.getCarID());

            dinningService(car);
        }
        print_separator();
        System.out.println("All cars have been served.\n" +
                "Gas cars: "  + gasCars + "\n" +
                "People served: " + people + " Robots served: " + robots + "\n" +
                "Dining cars: " + dining + " Not dining cars: " + notDining + "\n" +
                "Consumption (gas): " + consumptionGas);

        print_separator();
    }

    private void dinningService(Car car){
        if (car.needsDinner()) {
            dining += 1;
            if ("people".equalsIgnoreCase(car.getPassangerType())) {
                peopleDiningService.serveDinner(car.getCarID());
                people += 1;
            } else if ("robots".equalsIgnoreCase(car.getPassangerType())) {
                robotDiningService.serveDinner(car.getCarID());
                robots += 1;
            }
            dining += 1;
        } else {
            notDining += 1;
            if ("people".equalsIgnoreCase(car.getPassangerType())) {
                people += 1;
            } else if ("robots".equalsIgnoreCase(car.getPassangerType())) {
                robots += 1;
            }
        }
    }

    public Queue<Car> getQueue() {
        return queue;
    }

    private void print_separator() {
        System.out.println("-----------------------------------------------------");
    }

}
