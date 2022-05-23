/**
 * The Vehicle program implements an application that
 * receives characteristics of a vehicle, then alters
 * speed and properly formats the information for the
 * user to read.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

public class Vehicle {
    /**
     * Property for _colour.
     */
    protected String _colour;
    /**
     * Property for _doorNum.
     */
    protected int _doorNum;
    /**
     * Property for _seatNum.
     */
    protected int _seatNum;
    /**
     * Property for _length.
     */
    protected int _length;
    /**
     * Property for _speed.
     */
    protected int _speed;
    /**
     * Property for _maxSpeed.
     */
    protected int _maxSpeed;
    /**
     * Property for _plateNum.
     */
    private String _plateNum;

    /**
     * Default constructor for the class.
     *
     * @param plateNum passed in
     * @param colour passed in
     * @param doorNum passed in
     * @param seatNum passed in
     * @param length passed in
     * @param speed passed in
     * @param maxSpeed passed in
     */
    public Vehicle(String plateNum, String colour, int doorNum,
        int seatNum, int length, int speed, int maxSpeed) {
        this._plateNum = plateNum;
        this._colour = colour;
        this._doorNum = doorNum;
        this._seatNum = seatNum;
        this._length = length;
        this._speed = speed;
        this._maxSpeed = maxSpeed;
    }

    /**
     * Method that adds acceleration to the current speed.
     *
     * @param accelNum passed in
     */
    protected void accelerate(int accelNum) {
        // adds acceleration
        int newSpeed = _speed + accelNum;

        // checks if speed is at max
        if (_speed == _maxSpeed) {
            System.out.println("Vehicle has reached its max speed.");
        } else {
            _speed = newSpeed;

            // checks if speed is greater than max speed
            if (_speed > _maxSpeed) {
                _speed = _maxSpeed;
            }

            System.out.println("Vehicle has accelerated " + accelNum
                + " km/h");
        }
    }

    /**
     * Method that alters the speed by applying brakes.
     *
     * @param brakeNum passed in
     */
    protected void brake(int brakeNum) {
        // decreases amount of current speed
        int newSpeed = _speed - brakeNum;

        // checks if speed is at zero
        if (_speed == 0) {
            System.out.println("No change. Vehicle is at a speed of 0.");
        } else {
            _speed = newSpeed;

            // checks to make sure speed is not negative
            if (_speed < 0) {
                _speed = 0;
            }

            System.out.println("A brake of "
                + brakeNum + " km/h has been applied.");
        }
    }

    /**
     * Method that tells the user the current speed.
     */
    protected void getSpeed() {
        System.out.println("Current speed: " + _speed + " km/h");
    }

    /**
     * Method that tells the user what the max speed of a vehicle is.
     */
    protected void getMaxSpeed() {
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }

    /**
     * Method that tells user information and characteristics about a vehicle.
     */
    protected void getInfo() {
        // applies appropriate format for information
        System.out.println("License plate: " + _plateNum);
        System.out.println("Colour: " + _colour);
        System.out.println("Number of doors: " + _doorNum);
        System.out.println("Number of seats: " + _seatNum);
        System.out.println("Length: " + _length);
        System.out.println("Speed: " + _speed + " km/h");
        System.out.println("Max speed: " + _maxSpeed + " km/h");
    }
}
