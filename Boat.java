/**
 * The Boat program implements an application that
 * inherts characteristics from the Vehicle class.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

class Boat extends Vehicle {
    /**
     * Constructor for class.
     *
     * @param colour passed in
     * @param seatNum passed in
     * @param length passed in
     * @param speed passed in
     * @param maxSpeed passed in
     */
    public Boat(String colour, int seatNum,
        int length, int speed, int maxSpeed) {
        super("", colour, 0, seatNum, length, speed, maxSpeed);
    }

    /**
     * Method that uses polymorphism to alter format of vehicle info.
     */
    protected void getInfo() {
        System.out.println("Colour: " + _colour);
        System.out.println("Number of seats: " + _seatNum);
        System.out.println("Length: " + _length + " ft");
        System.out.println("Speed: " + _speed + " km/h");
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }
}
