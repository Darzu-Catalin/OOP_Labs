package Test;

import Lab3.CarService.Car;
import Lab3.CarService.CarStation;
import Lab3.CarService.Semaphore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemaphoreTest {

    @Test
    void testGuideCar() {
        // Create a single CarStation and Semaphore
        CarStation carStation = new CarStation();
        Semaphore semaphore = new Semaphore(carStation);

        // Create individual JSON strings for each car
        String car1Json = """
                {"id": 1, "type": "GAS", "passengers": "PEOPLE", "isDining": false, "consumption": 24}
                """;
        String car2Json = """
                {"id": 2, "type": "ELECTRIC", "passengers": "PEOPLE", "isDining": false, "consumption": 26}
                """;
        String car3Json = """
                {"id": 3, "type": "ELECTRIC", "passengers": "ROBOTS", "isDining": false, "consumption": 29}
                """;
        String car4Json = """
                {"id": 4, "type": "GAS", "passengers": "ROBOTS", "isDining": true, "consumption": 48}
                """;
        String car5Json = """
                {"id": 5, "type": "ELECTRIC", "passengers": "PEOPLE", "isDining": false, "consumption": 26}
                """;

        // Guide each car into the CarStation
        semaphore.guideCar(car1Json);
        semaphore.guideCar(car2Json);
        semaphore.guideCar(car3Json);
        semaphore.guideCar(car4Json);
        semaphore.guideCar(car5Json);

        // Assertions for car counts in the Semaphore
        assertEquals(2, semaphore.getCountGasCars(), "Gas car count should be 2");
        assertEquals(3, semaphore.getCountElectricCars(), "Electric car count should be 3");

        // Assertions for the queue in CarStation
        assertEquals(5, semaphore.getCarStation().getQueue().size(), "CarStation should have 5 cars in the queue");

        // Verify cars in the queue (order of addition matters)
        Car firstCar = carStation.getQueue().dequeue();
        assertEquals("GAS", firstCar.getFuelType(), "First car should be of type 'GAS'");
        assertEquals("1", firstCar.getCarID(), "First car should have ID 1");

        Car secondCar = carStation.getQueue().dequeue();
        assertEquals("ELECTRIC", secondCar.getFuelType(), "Second car should be of type 'ELECTRIC'");
        assertEquals("2", secondCar.getCarID(), "Second car should have ID 2");

        Car thirdCar = carStation.getQueue().dequeue();
        assertEquals("ELECTRIC", thirdCar.getFuelType(), "Third car should be of type 'ELECTRIC'");
        assertEquals("3", thirdCar.getCarID(), "Third car should have ID 3");

        Car fourthCar = carStation.getQueue().dequeue();
        assertEquals("GAS", fourthCar.getFuelType(), "Fourth car should be of type 'GAS'");
        assertEquals("4", fourthCar.getCarID(), "Fourth car should have ID 4");

        Car fifthCar = carStation.getQueue().dequeue();
        assertEquals("ELECTRIC", fifthCar.getFuelType(), "Fifth car should be of type 'ELECTRIC'");
        assertEquals("5", fifthCar.getCarID(), "Fifth car should have ID 5");


    }
}
