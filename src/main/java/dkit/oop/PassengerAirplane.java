package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane {

    // fields(Q2)
    private int MAX_NUM_PASSENGERS;
    private ArrayList<String> passengerList;
    private List list;

    public PassengerAirplane(String type, int maxNumPassengers) {
        // code here
        super(type);
        this.MAX_NUM_PASSENGERS = maxNumPassengers;
    }

    public void addPassenger(String name) {
        // code here
            if (passengerList.size() >= MAX_NUM_PASSENGERS)
            {
                System.out.println("You have exceeded the maximum number of passengers");
            }
            else
            {
                passengerList.add(name);
            }
    }

    //toString()
    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "MAX_NUM_PASSENGERS=" + MAX_NUM_PASSENGERS +
                ", passengerList=" + passengerList +
                '}';
    }

} // end of PassengerAirplane
