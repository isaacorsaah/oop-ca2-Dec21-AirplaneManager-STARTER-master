package dkit.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * OOP CA2 December 2021 - Airplane Management System  STARTER CODE
 */
public class App 
{
    public static void main( String[] args ){
        new App().start();
    }

    private void start() {

        System.out.println("OOP - CA2 - 20% - December 2021 - AirplaneManager");

        //Q2
         CargoAirplane cargoPlane1 = new CargoAirplane("Douglas DC-4",20000);
         CargoAirplane cargoPlane2 = new CargoAirplane("Boeing C-7000",25000);
        // display the two objects
        System.out.println("Cargo Plane 1 = "+cargoPlane1.getType()+" : "+ cargoPlane1 + "\n Cargo plane 2 = "
                +cargoPlane2.getType()+" : "
                +cargoPlane2);

        //AirplaneManager mgr = new AirplaneManager();

        //Q2
         PassengerAirplane passengerPlane1 = new PassengerAirplane("Boeing 747",524);
         PassengerAirplane passengerPlane2 = new PassengerAirplane("Airbus 380",525);

         //Add passengers to Passenger planes
         passengerPlane1.addPassenger("Tom Hardy");
         passengerPlane1.addPassenger("Margot Robbie");
         passengerPlane2.addPassenger("Emma Thompson");

        //Q3

        // write calls to methods implemented for Q3.
        Scanner sc = new Scanner(System.in);
        System.out.println("Add an airplane");
        String airplane = sc.nextLine();


        //Question 4
        // Uncomment all the code below and implement the two methods
        // in the CityDistanceManager class.

        CityDistanceManager cityDistanceManager = new CityDistanceManager();
        cityDistanceManager.printCitiesData();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nPlease enter first city name:");
        String city1 = keyboard.nextLine();
        System.out.print("Please enter second city name:");
        String city2 = keyboard.nextLine();

        int distance = cityDistanceManager.findDistanceBetween(city1, city2);
        System.out.println("Distance between " + city1 + " and " + city2 + " = " + distance);

        System.out.print("\nEnter base city name:");
        String baseCity = keyboard.nextLine();

        String closestCity = cityDistanceManager.findClosestCityTo(baseCity);
        System.out.println("Closest city to " + baseCity+" = " + closestCity);

    }
}
