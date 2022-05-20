import java.util.ArrayList;
import java.util.List;

/**
 * The VehicleInventory program implements an application
 * that creates two vehicles and calls separate classes
 * properly print information and alter the speed.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-16
 */

public class VehicleInventory {
    /**
     * Default constructor for the class.
     */
    public VehicleInventory() { }

    /**
     * Main entry into the program.
     *
     * @param args nothing passed in
     */
    public static void main(String[] args) {
        // create vehicles
        // Bike myBike = new Bike("MAT 105", "Purple", 1, 0, 55);
        Truck myTruck = new Truck("BBV 4389", "Navy Blue", 4, 22, 56, 0, 85);

        // declaring variables
        List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();

        // adds each vehicle to list
        listOfVehicles.add(myTruck);
        // listOfVehicles.add(Bike);

        System.out.println("Adjustments for Vehicle One:");

        // calls appropriate methods for first vehicle
        listOfVehicles.get(0).getMaxSpeed();
        listOfVehicles.get(0).accelerate(30);
        listOfVehicles.get(0).accelerate(65);
        listOfVehicles.get(0).getSpeed();
        listOfVehicles.get(0).brake(25);
        listOfVehicles.get(0).accelerate(15);
        listOfVehicles.get(0).brake(1);
        listOfVehicles.get(0).getSpeed();

        System.out.println();
        System.out.println("Vehicle #1 Information:");

        // calls method in vehicle class to print info
        listOfVehicles.get(0).getInfo();

        // System.out.println();
        // System.out.println("Adjustments for Vehicle Two:");

        // // calls appropriate methods for second vehicle
        // listOfVehicles.get(1).getMaxSpeed();
        // listOfVehicles.get(1).brake(13);
        // listOfVehicles.get(1).accelerate(45);
        // listOfVehicles.get(1).brake(26);
        // listOfVehicles.get(1).getSpeed();
        // listOfVehicles.get(1).accelerate(22);
        // listOfVehicles.get(1).brake(4);
        // listOfVehicles.get(1).getSpeed();
        // listOfVehicles.get(1).accelerate(223);

        // System.out.println();
        // System.out.println("Vehicle #2:");

        // // calls method in vehicle class to print info
        // listOfVehicles.get(1).getInfo();
    }
}
