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
     * Property for _wheelNum.
     */
    private int _wheelNum;
    /**
     * Property for _plateNum.
     */
    private String _tailNum;
    /**
     * Property for _doorNum.
     */
    private int _doorNum;

    /**
     * Constructor for class.
     *
     * @param tailNum passed in
     * @param colour passed in
     * @param doorNum passed in
     * @param wheelNum passed in
     * @param seatNum passed in
     * @param length passed in
     * @param speed passed in
     * @param maxSpeed passed in
     */
    public Plane(String tailNum, String colour, int doorNum,
        int wheelNum, int seatNum, int length, int speed, int maxSpeed) {
        super("", colour, doorNum, seatNum, length, speed, maxSpeed);
        _wheelNum = wheelNum;
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
        System.out.println("Number of seats: " + _seatNum);
        System.out.println("Length: " + _length + " ft");
        System.out.println("Speed: " + _speed + " km/h");
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }
}
