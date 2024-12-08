package Lab3.CarService;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Objects;

public class Semaphore {
    private final CarStation carStation; // Single CarStation instance
    private int countGasCars;
    private int countElectricCars;

    public Semaphore(CarStation carStation) {
        this.carStation = carStation;
    }

    /**
     * Guides cars to the appropriate processing based on their type and fuel needs.
     *
     * @param jsonCars JSON string containing a list of cars.
     */
    public void guideCar(String jsonCars) {
        try {
            // Parse JSON string into a list of Car objects
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = objectMapper.readValue(jsonCars, Car.class);
            if(Objects.equals(car.getFuelType(), "GAS")){
                countGasCars++;
            } else {
                countElectricCars++;
            }
            carStation.addCar(car);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CarStation getCarStation() {
        return carStation;
    }

    public int getCountGasCars() {
        return countGasCars;
    }

    public int getCountElectricCars() {
        return countElectricCars;
    }
}
