/**
 * The Plane program implements an application that
 * inherts characteristics from the Vehicle class.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

class Plane extends Vehicle {
    /**
     * Property for _wheelNum
     */
    private int _wheelNum;
    /**
     * Property for _length
     */
    private int _length;
    /**
     * Property for _plateNum
     */
    private String _tailNum;
    /**
     * Property for _doorNum
     */
    private int _doorNum;

    /**
     * Constructor for class.
     */
    public Plane(String tailNum, String colour, int doorNum,
        int wheelNum, int length, int speed, int maxSpeed) {
        super(tailNum, colour, doorNum, speed, maxSpeed);
        _wheelNum = wheelNum;
        _length = length;
        _tailNum = tailNum;
        _doorNum = doorNum;
    }

    /**
     * Method that uses polymorphism to alter format of vehicle info.
     */
    protected void getInfo() {
        System.out.println("Tail number: " + _tailNum);
        System.out.println("Colour: " + _colour);
        System.out.println("Number of doors: " + _doorNum);
        System.out.println("Number of wheels: " + _wheelNum);
        System.out.println("Length: " + _length + "ft");
        System.out.println("Speed: " + _speed + " km/h");
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }
}
