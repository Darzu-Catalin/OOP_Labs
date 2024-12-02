package Lab3.Dinner;

public class PeopleDinner implements Dineable {
    private static int peopleServedCount = 0;

    @Override
    public void serveDinner(String carID){
        System.out.println("Serving dinner to people in car " + carID);
        peopleServedCount++;
    }

    public static int getPeopleServed(){
        return peopleServedCount;
    }
}
