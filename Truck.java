/**
 * The Truck program implements an application that
 * inherts characteristics from the Vehicle class.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

class Truck extends Vehicle {
    /**
     * Property for _wheelNum
     */
    public int _wheelNum;
    /**
     * Property for _length
     */
    public int _length;

    /**
     * Constructor for class.
     */
    public Truck(String plateNum, String colour, int doorNum,
        int wheelNum, int length, int speed, int maxSpeed) {
        super(plateNum, colour, doorNum, speed, maxSpeed);
        _wheelNum = wheelNum;
        _length = length;
    }
}
