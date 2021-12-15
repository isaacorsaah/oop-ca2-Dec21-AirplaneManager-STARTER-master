package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager{

    ArrayList<Airplane> airplaneList;

    public AirplaneManager()
    {
        airplaneList = new ArrayList<>();
    }
    //Q3.

    // write add() method
    public void add(Airplane airplane)
    {
        for(Airplane p : airplaneList)
        {

        }
    }

    public void displayAllAirplanes()
    {
        // add code
        for (Airplane p : airplaneList)
        {
            System.out.println(p.toString());
        }
    }

    public void displayAllPassengerAirplanes()
    {
        // add code

    }

    //  write method getAllCargoAirplanes()
    public void getAllCargoAirplanes(ArrayList<AirplaneManager> list)
    {
        for(AirplaneManager p : list)
        {

        }
    }

    // write  addPassengerNameToAirplane( airplaneId, passengerName)
    public void addPassengerNameToAirplane(int airplaneId, String passengerName)
    {

    }

    // write containsAirplane( Airplane plane )
    public void containsAirplane( Airplane plane )
    {

    }

    // write findAirplaneByPassengerName( passengerName )
    public void findAirplaneByPassengerName(String passengerName)
    {

    }

    // write displayAllAirplanesInOrderOfType( argument )
    public void displayAllAirplanesInOrderOfType(String argument)
    {

    }


} // end of AirplaneManager


