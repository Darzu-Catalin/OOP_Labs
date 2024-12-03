package Lab3.CarService;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;

public class Car {
    private final String carID;
    private final String fuelType;
    private final String customerType;
    private final boolean needsDinner;
    private final int consumption;

    @JsonCreator
    public Car(
            @JsonProperty("id") String carID,
            @JsonProperty("type") String fuelType,
            @JsonProperty("passengers") String customerType,
            @JsonProperty("isDining") boolean needsDinner,
            @JsonProperty("consumption") int consumption
    ) {

        this.carID = carID;
        this.fuelType = fuelType;
        this.customerType = customerType;
        this.needsDinner = needsDinner;
        this.consumption = consumption;
    }

    public String getCarID(){
        return carID;
    }

    public String getFuelType(){
        return fuelType;
    }

    public String getPassangerType(){
        return customerType;
    }

    public boolean needsDinner(){
        return needsDinner;
    }

    public int getConsumption(){
        return consumption;
    }
}
