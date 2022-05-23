/**
 * The Bike program implements an application that
 * inherts characteristics from the Vehicle class.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

class Bike extends Vehicle {
    /**
     * Property for _seatNum
     */
    private int _seatNum;
    /**
     * Property for _wheelNum
     */
    private int _wheelNum;

    /**
     * Constructor for class.
     */
    public Bike(String colour, int wheelNum, int seatNum, int speed, int maxSpeed) {
        // super(colour, wheelNum, seatNum, speed, maxSpeed);
        super("", colour, 0, speed, maxSpeed);
        _seatNum = seatNum;
        _wheelNum = wheelNum;
    }

    /**
     * Method that uses polymorphism to alter format of vehicle info.
     */
    protected void getInfo() {
        System.out.println("Colour: " + _colour);
        System.out.println("Number of wheels: " + _wheelNum);
        System.out.println("Number of seats: " + _seatNum);
        System.out.println("Speed: " + _speed + " km/h");
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }
}
