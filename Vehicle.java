/**
 * The Vehicle program implements an application that
 * acts as an abstract class to create a template for
 * necessary functions in any subclasses.
 *
 * @author  Ina Tolo
 * @version 1.0
 * @since   2022-5-20
 */

public abstract class Vehicle {
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
    protected abstract void accelerate(int accelNum);

    /**
     * Method that alters the speed by applying brakes.
     *
     * @param brakeNum passed in
     */
    protected abstract void brake(int brakeNum);

    /**
     * Method that tells the user the current speed.
     */
    protected abstract void getSpeed();

    /**
     * Method that tells the user what the max speed of a vehicle is.
     */
    protected abstract void getMaxSpeed();

    /**
     * Method that tells user information and characteristics about a vehicle.
     */
    protected abstract void getInfo();
}
