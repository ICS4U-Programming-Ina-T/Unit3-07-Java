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
     * Property for _length
     */
    private int _length;

    /**
     * Constructor for class.
     */
    public Boat(String colour, int length, int speed, int maxSpeed) {
        super("", colour, 0, speed, maxSpeed);
        _length = length;
    }

    protected void getInfo() {
        System.out.println("Colour: " + _colour);
        System.out.println("Length: " + _length + "ft");
        System.out.println("Speed: " + _speed + " km/h");
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }
}
