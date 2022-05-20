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
     * Property for _seetNum
     */
    public int _seetNum;
    /**
     * Property for _wheelNum
     */
    public int _wheelNum;

    /**
     * Constructor for class.
     */
    public Bike(String colour, int wheelNum, int seatNum, int speed, int maxSpeed) {
        super(plateNum, colour, doorNum, speed, maxSpeed);
        _wheelNum = wheelNum;
        _length = length;
    }
}
