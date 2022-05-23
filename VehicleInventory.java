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
        Truck myTruck = new Truck("BBV 4389", "Navy Blue", 4, 22, 19, 0, 85);
        Bike myBike = new Bike("Purple", 3, 2, 0, 55);
        Plane myPlane = new Plane("C-MWEX", "White", 6, 16, 120, 0, 1300);
        Boat myBoat = new Boat("Beige", 12, 0, 5);

        // declaring variables
        List<Vehicle> listOfVehicles = new ArrayList<Vehicle>();

        // adds each vehicle to list
        listOfVehicles.add(myTruck);
        listOfVehicles.add(myBike);
        listOfVehicles.add(myPlane);
        listOfVehicles.add(myBoat);

        System.out.println("Adjustments for Truck One:");

        // calls appropriate methods for truck one
        listOfVehicles.get(0).getMaxSpeed();
        listOfVehicles.get(0).accelerate(30);
        listOfVehicles.get(0).accelerate(65);
        listOfVehicles.get(0).getSpeed();
        listOfVehicles.get(0).brake(25);
        listOfVehicles.get(0).accelerate(15);
        listOfVehicles.get(0).brake(1);
        listOfVehicles.get(0).getSpeed();

        System.out.println();
        System.out.println("Truck #1 Information:");

        // calls method in vehicle class to print info
        listOfVehicles.get(0).getInfo();

        System.out.println();
        System.out.println("Adjustments for Bike One:");

        // calls appropriate methods for bike one
        listOfVehicles.get(1).getMaxSpeed();
        listOfVehicles.get(1).brake(13);
        listOfVehicles.get(1).accelerate(45);
        listOfVehicles.get(1).brake(26);
        listOfVehicles.get(1).getSpeed();
        listOfVehicles.get(1).accelerate(22);
        listOfVehicles.get(1).brake(4);
        listOfVehicles.get(1).getSpeed();
        listOfVehicles.get(1).accelerate(223);

        System.out.println();
        System.out.println("Bike #1:");

        // calls method in vehicle class to print info
        listOfVehicles.get(1).getInfo();

        System.out.println();
        System.out.println("Adjustments for Plane One:");

        // calls appropriate methods for plane one
        listOfVehicles.get(2).getMaxSpeed();
        listOfVehicles.get(2).brake(130);
        listOfVehicles.get(2).accelerate(290);
        listOfVehicles.get(2).brake(35);
        listOfVehicles.get(2).getSpeed();
        listOfVehicles.get(2).accelerate(22);
        listOfVehicles.get(2).brake(4);
        listOfVehicles.get(2).getSpeed();
        listOfVehicles.get(2).accelerate(555);

        System.out.println();
        System.out.println("Plane #1:");

        // calls method in vehicle class to print info
        listOfVehicles.get(2).getInfo();

        System.out.println();
        System.out.println("Adjustments for Boat One:");

        // calls appropriate methods for boat one
        listOfVehicles.get(3).getMaxSpeed();
        listOfVehicles.get(3).accelerate(2);
        listOfVehicles.get(3).brake(1);
        listOfVehicles.get(3).getSpeed();
        listOfVehicles.get(3).accelerate(2);
        listOfVehicles.get(3).brake(2);
        listOfVehicles.get(3).getSpeed();
        listOfVehicles.get(3).accelerate(3);

        System.out.println();
        System.out.println("Boat #1:");

        // calls method in vehicle class to print info
        listOfVehicles.get(3).getInfo();
    }
}
